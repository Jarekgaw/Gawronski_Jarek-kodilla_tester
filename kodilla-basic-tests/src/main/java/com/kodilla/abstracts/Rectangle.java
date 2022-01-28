package com.kodilla.abstracts;

import java.sql.SQLOutput;

public class Rectangle extends Shape {
    static double circumB(double a, double b) {
        return b = a + b + a + b;
    }
static double fieldB(double a, double b)
{
    return b = a * b;
}

    @Override
    public void circumference() {
        System.out.println(Rectangle.circumB(4,5));

    }

    @Override
    public void field() {
        System.out.println(Rectangle.fieldB(4,5));

    }
}
