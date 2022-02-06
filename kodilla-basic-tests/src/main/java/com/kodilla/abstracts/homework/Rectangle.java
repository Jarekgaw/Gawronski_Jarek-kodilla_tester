package com.kodilla.abstracts.homework;
public class Rectangle extends Shape {


    @Override
    public double circumference(double a, double b) {
        return 2 * a + 2 * b;
    }

    @Override
    public double field( double a, double b) {

        return a * b;
    }
}


