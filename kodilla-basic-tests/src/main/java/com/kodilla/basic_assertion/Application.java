package com.kodilla.basic_assertion;

import static org.testng.AssertJUnit.assertEquals;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double a = 10;
        double b = -5.2;
        double subResult;
        subResult = calculator.sub(a, b);
        double delta = 0;
        assertEquals(5, subResult, delta);
        }
    }
