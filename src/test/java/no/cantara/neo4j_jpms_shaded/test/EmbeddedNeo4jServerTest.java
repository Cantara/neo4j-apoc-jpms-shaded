package no.cantara.neo4j_jpms_shaded.test;


import org.junit.jupiter.api.Test;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.dbms.api.DatabaseManagementServiceBuilder;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.ResourceIterator;
import org.neo4j.graphdb.Result;
import org.neo4j.graphdb.Transaction;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;

public class EmbeddedNeo4jServerTest {

    @Test
    void thatBasicEmbeddedNeo4jCanExecuteCypherAndFindNodes() throws IOException {
        String neo4jHomeStr = "target/_neo4j-basic-embedded-test-" + UUID.randomUUID();
        Path neo4jHomePath = Path.of(neo4jHomeStr);
        try {
            Files.createDirectories(neo4jHomePath);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
        DatabaseManagementService managementService = new DatabaseManagementServiceBuilder(neo4jHomePath).build();
        try {
            GraphDatabaseService graphDb = managementService.database(DEFAULT_DATABASE_NAME);
            try (Transaction tx = graphDb.beginTx(3, TimeUnit.MINUTES)) {
                /*
                 * Cypher examples are taken from the neo4j getting-started docs: https://neo4j.com/docs/getting-started/5/cypher-intro/large-statements/
                 */
                try (Result result = tx.execute("""
                        CREATE (matrix:Movie {title: 'The Matrix', released: 1997})
                        CREATE (cloudAtlas:Movie {title: 'Cloud Atlas', released: 2012})
                        CREATE (forrestGump:Movie {title: 'Forrest Gump', released: 1994})
                        CREATE (keanu:Person {name: 'Keanu Reeves', born: 1964})
                        CREATE (robert:Person {name: 'Robert Zemeckis', born: 1951})
                        CREATE (tom:Person {name: 'Tom Hanks', born: 1956})
                        CREATE (tom)-[:ACTED_IN {roles: ['Forrest']}]->(forrestGump)
                        CREATE (tom)-[:ACTED_IN {roles: ['Zachry']}]->(cloudAtlas)
                        CREATE (robert)-[:DIRECTED]->(forrestGump)""")) {
                }
                try (Result result = tx.execute("""
                        MATCH (actor:Person)-[r:ACTED_IN|DIRECTED]->(movie:Movie)
                        RETURN actor.name AS name, type(r) AS type, movie.title AS title""")) {
                    System.out.printf("+-------------------------------------------------+%n");
                    System.out.printf("| name              | type       | title          |%n");
                    System.out.printf("+-------------------------------------------------+%n");
                    while (result.hasNext()) {
                        Map<String, Object> next = result.next();
                        System.out.printf("| %-17s | %-10s | %-14s |%n", String.format("'%s'", next.get("name")), String.format("'%s'", next.get("type")), String.format("'%s'", next.get("title")));
                    }
                    System.out.printf("+-------------------------------------------------+%n");
                }
                try (ResourceIterator<Node> movies = tx.findNodes(Label.label("Movie"))) {
                    while (movies.hasNext()) {
                        Node next = movies.next();
                        System.out.printf("'%s' (%d)%n", next.getProperty("title"), next.getProperty("released"));
                    }
                }
            }
        } finally {
            managementService.shutdown();
            Files.walk(neo4jHomePath)
                    .sorted(Comparator.reverseOrder())
                    .map(Path::toFile)
                    .forEach(File::delete);
        }
    }
}
