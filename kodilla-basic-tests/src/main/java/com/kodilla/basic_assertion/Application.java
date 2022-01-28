package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 5;
        int subResult = calculator.sub(a, b);
        boolean correct = ResultChecker.assertEquals(5, subResult);
        if (correct) {
            System.out.println("Metoda sub działa prawidłowo dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda dub nie działa prawidłowo dla liczb" + a + " i " + b);
        }
    }
}
