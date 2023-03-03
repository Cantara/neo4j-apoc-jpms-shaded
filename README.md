# neo4j-apoc-jpms-shaded
Shaded version of Neo4j+Lucene with JPMS module support.

This only exists because Neo4j 5.x does not support JPMS modules. Once that is fixed this will go away.

# Notes
Not only Neo4j needs to be included here. The dependencies Lucene, Shiro, and some Scala libraries are also included, because they too have split packages or jar files that cannot be automatic modules.

This jar was produced using maven-shade-plugin and moditect in Maven.
