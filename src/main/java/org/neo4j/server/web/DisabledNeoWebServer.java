package org.neo4j.server.web;

public class DisabledNeoWebServer extends org.neo4j.kernel.lifecycle.LifecycleAdapter implements WebContainerThreadInfo {
    public DisabledNeoWebServer() {
    }

    public int allThreads() {
        return 0;
    }

    public int idleThreads() {
        return 0;
    }
}
