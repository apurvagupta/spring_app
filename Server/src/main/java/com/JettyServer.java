package com;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class JettyServer {

    public static void main(String[] args) throws Exception {
        int port = 8090;
        String warPath = "WEB/target/WEB-1.0-SNAPSHOT.war";

        Server server = new Server(port);
        WebAppContext  webapp = new WebAppContext();
        webapp.setContextPath("/myApp");
        webapp.setWar(warPath);

        server.setHandler(webapp);
        server.start();
        server.join();
    }
}
