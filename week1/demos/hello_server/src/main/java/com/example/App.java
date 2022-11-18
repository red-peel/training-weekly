package com.example;
import io.javalin.Javalin;
import com.example.utils.Router;

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
        Router.setUpEndPoints(app);
    }
}
