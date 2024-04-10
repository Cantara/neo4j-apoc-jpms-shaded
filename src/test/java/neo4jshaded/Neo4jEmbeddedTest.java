package neo4jshaded;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.dbms.api.DatabaseManagementServiceBuilder;
import org.neo4j.dbms.api.DatabaseManagementServiceBuilderImplementation;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Result;
import org.neo4j.graphdb.ResultTransformer;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.graphdb.factory.module.edition.AbstractEditionModule;
import org.neo4j.graphdb.factory.module.edition.CommunityEditionModule;
import org.neo4j.server.config.AuthConfigProvider;
import org.neo4j.server.rest.repr.MappingRepresentation;

import java.io.File;
import java.util.Collections;
import java.util.function.Function;

public class Neo4jEmbeddedTest {

    @Test
    public void testEmbedded(@TempDir File tempDir)
    {
        // The below is so that we can cut out neo4j-server from dependencies
        DatabaseManagementService dbms = new DatabaseManagementServiceBuilderImplementation(tempDir.toPath())
        {
            @Override
            protected Function<GlobalModule, AbstractEditionModule> getEditionFactory(Config config) {
                return globalModule -> new CommunityEditionModule(globalModule)
                {
                    @Override
                    protected AuthConfigProvider createAuthConfigProvider(GlobalModule globalModule) {
                        return new AuthConfigProvider() {
                            @Override
                            public MappingRepresentation getRepresentation() {
                                return null;
                            }
                        };
                    }
                };
            }
        }.build();

        try {
            GraphDatabaseService gds = dbms.database("neo4j");
            gds.executeTransactionally("""
            CREATE (n {foo:"bar"})
            """);
            System.out.println(gds.executeTransactionally("MATCH (n) RETURN properties(n)", Collections.emptyMap(), (ResultTransformer<Object>) Result::next));
        } finally {
            dbms.shutdown();
        }
    }
}
