package org.example;

import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress("localhost", 8080), 0);
        server.createContext("/", new SimpleHttpServer.MyHandler());
        server.start();
        System.out.println("Server started on port 8080");
    }
}