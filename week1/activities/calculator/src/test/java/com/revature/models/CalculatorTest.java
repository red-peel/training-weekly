package com.revature.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void addShouldAdd() {
        // arrange
        Calculator testCalculator = new Calculator();
        double x = 50;
        double y = 2;
        double expected = 52;
        // act
        double actual = testCalculator.add(x, y);
        // assert
        assertEquals(expected, actual);
    }
    @Test
    public void subShouldSub(){
        Calculator testCalculator = new Calculator();
        double x = 5;
        double y = 2;
        double expected = 3;

        double actual = testCalculator.subtract(x, y);

        assertEquals(expected, actual);

    }
    @Test 
    void divideShouldDivide(){
        Calculator testCalculator = new Calculator();
        double x = 5;
        double y = 2;
        double expected = 2.5;

        double actual = testCalculator.divide(x, y);

        assertEquals(expected, actual);
    }
    @Test 
    void factorialShouldFactorial(){
        Calculator testCalculator = new Calculator();
        double x = 4;
        double expected = 24;

        double actual = testCalculator.factorial(x);

        assertEquals(expected, actual);
    }
    @Test
    void comboShouldCombo(){
        Calculator testCalculator = new Calculator();
        double x = 25;
        double y = 3;
        double expected = 2300;

        double actual = testCalculator.combo(x,y);

        assertEquals(expected, actual);
    }
}
