package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarApplication {
public static void main(String[] args) {
        Car[] carss = new Car[5];
        for (int n = 0; n < cars.length; n++)
        cars[n] = drawCars();
        for (Car car : cars)
        CarUtils.drawCarKind(car);
        }

private static Car drawCars() {
        Random random = new Random();
        // draw a kind of the shape
        int drawnShapeKind = random.nextInt(3);     // possible values: 0, 1, 2
        double a = random.nextDouble() * 100 + 1;   // possible values: 1.000-100.999 ...
        double b = random.nextDouble() * 100 + 1;
        double c = random.nextDouble() * 100 + 1;
        if (drawnShapeKind == 0)
        return new Opel(a);
        else if (drawnShapeKind == 1)
        return new Toyota();
        else
        return new Triangle(a, b, c);
        }
        }