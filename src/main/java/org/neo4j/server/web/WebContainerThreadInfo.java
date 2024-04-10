package org.neo4j.server.web;

public interface WebContainerThreadInfo {
    int allThreads();

    int idleThreads();
}
