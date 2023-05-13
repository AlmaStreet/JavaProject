package org.example;
import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        get("/", (req, res) -> "Hello, world!");
        // Start server on port 4567
        port(4567);

        // Define routes
        get("/", (req, res) -> "Hello, world!");
        get("/hello/:name", (req, res) -> "Hello, " + req.params("name"));
//        awaitInitialization();
    }
}