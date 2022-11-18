package com.example.utils;
import io.javalin.*;

//used to set up the paths for server

public class Router {
    public static void setUpEndPoints(Javalin app){
        app.get("/", ctx -> {
            ctx.result("Hi dude");
        });
        
        app.get("/hello", ctx -> {
            ctx.result("<Hi dude, ADVANCED>");
            ctx.status(418);
        });
    }
}
