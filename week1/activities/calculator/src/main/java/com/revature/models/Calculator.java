package com.revature.models;
import java.lang.RuntimeException;

public class Calculator {
    public double add(double x, double y) {
        return x + y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    public double divide(double x, double y) {
        if (y==0){
            throw new RuntimeException("Can't divide by zero");
        }
        return x / y;
    }

    public double factorial(double x){
        double answer = 1;
        for (double i = 1; i <= x; i++) {
           answer = answer * i;
        }
        return answer;
    }
    
    public double combo(double n, double r){
        //find n-r to do (n-r)!
        double a = n - r;
        return factorial(n)/(factorial(r)*factorial(a));
    }
}
