package com.kodilla.basic_assertion;

import static org.testng.AssertJUnit.assertEquals;

public class ApplicationSQU {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double a = -4;
        double b = 0;
        double c = 5;
        double subResult = calculator.squ(a);
        double delta = 0;
        assertEquals(5, subResult, delta);
    }
}