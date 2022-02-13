package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("---------------------------");
        System.out.println("Car kind: " + car.getSpeed());
        car.increaseSpeed();
        car.decreaseSpeed();
    }

    private static String getCarName(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Toyota)
            return "Toyota";
        else if (car instanceof Opel)
            return "Opel";
        else
            return "Unknown car name";

    }

    private static Car drawCar() {
        Random random = new Random();
        int drawCarKind = random.nextInt(3);
        int carA = random.nextInt() * 200 + 1;
        int carB = random.nextInt() * 200 + 1;
        int carC = random.nextInt() * 200 + 1;
        if (drawCarKind == 0)
            return new Opel(carA);
        else if (drawCarKind == 1)
            return new Toyota(carB);
        else
            return new Ford(carC);
    }

    public static class CarApplication {
        public static void main(String[] args) {
            Car[] cars = new Car[16];
            for (int n = 0; n < cars.length; n++)
                cars[n] = drawCar();
            for (Car car : cars)
                CarUtils.describeCar(car);
        }

        Random random = new Random();
        Car[] cars = new Car[random.nextInt(20) + 1];
    }
}
