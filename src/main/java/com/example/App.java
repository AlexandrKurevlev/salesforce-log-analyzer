package com.example;

import static spark.Spark.*;

public class App {

    public static void main(String[] args) {
        port(getPort());

        staticFileLocation("/public");

        init();
    }

    private static int getPort() {
        ProcessBuilder process = new ProcessBuilder();
        int port;
        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 4576;
        }
        return port;
    }

}
