package net.kyberia.jetty;

import org.eclipse.jetty.server.Server;
/*
    Dummy jetty serving unhandled responses
*/

public class App {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        server.setHandler(new DummyHandler());
        server.start();
        server.join();
    }
}
