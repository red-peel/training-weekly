package com.example;
import 
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
        System.out.println("Port created at "+port);
        app.get("/", ctx -> ctx.result(""));
    }
}
