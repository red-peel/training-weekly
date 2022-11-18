package com.example;

import io.javalin.Javalin;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int port = (7000);
        Javalin app = Javalin.create().start(port);
        app.get("/", ctx -> ctx.result("Hi dude"));
        app.get("/hello", ctx -> {
            ctx.result("<Hi dude, ADVANCED>");
            ctx.status(418);
        });
    }
}
