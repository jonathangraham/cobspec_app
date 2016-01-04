package com.jgraham.cobspec;

import com.jgraham.cobspec.Routers.CobspecRouter;
import com.jgraham.server.Routers.iAppRouter;
import com.jgraham.server.ServerConnection.Server;
import com.jgraham.server.ServerConnection.ServerConfig;

public class Main {
    public static void main(String args[]) throws Exception {

        ServerConfig config = new ServerConfig();
        config.parseArgs(args);
        int port = config.getPort();
        String directory = config.getDirectory();
        iAppRouter appRouter = new CobspecRouter(directory);
        startServer(port, appRouter);
    }

    public static void startServer(int port, iAppRouter appRouter) throws Exception{
        Server server = new Server(port, appRouter);
        server.start();
    }
}



