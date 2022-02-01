package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 8;
        double sumResult = calculator.sum(a, b);
        double delta = 0;
        assertEquals(13, sumResult, delta);
    }
    @Test
    public void testSQU() {
        Calculator calculator = new Calculator();
        double a = -3;
        double delta = 0;
        double squResult = calculator.squ(a);
        assertEquals(9, squResult, delta);
    }
    public void testSub() {
        Calculator calculator = new Calculator();
            double a = 4.5;
            double b = 3;
            double delta = 0;
            double subResult = calculator.sub(a,b);
            assertEquals(1.5, subResult, delta) {
        }
    }
}
