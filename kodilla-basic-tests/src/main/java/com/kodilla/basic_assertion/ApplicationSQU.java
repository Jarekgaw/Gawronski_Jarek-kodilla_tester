package com.kodilla.basic_assertion;

public class ApplicationSQU {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int squResult = calculator.squ(a);
        boolean correct = ResultChecker.assertEquals(25, squResult);
        if (correct) {
            System.out.println("Metoda squ działa prawidłowo dla liczb " + a);
        } else {
            System.out.println("Metoda squ nie działa prawidłowo dla liczb" + a);
        }
    }
}