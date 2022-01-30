package com.kodilla.abstracts.homework;

public class Square extends Shape {
    static double fieldA(double a)
    {
        return a = a * a;

    }
    static double circumA(double b)
    {
        return b = b * b * b * b;
    }
    @Override
    public void circumference() {
        System.out.println(Square.circumA(3));
    }

    @Override
    public void field() {
        System.out.println(Square.fieldA(3));
    }
}
