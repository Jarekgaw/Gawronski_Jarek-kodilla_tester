package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarApplication {
        public static void main(String[] args) {
                Car[] cars = new Car[15];
                for (int n = 0; n < cars.length; n++)
                        cars[n] = drawCars();
                for (Car car : cars)
                        CarUtils.describeCar(car);
        }

        private static Car drawCars() {
                Random random = new Random();
                int drawnShapeKind = random.nextInt(3);
                double carA = random.nextDouble() * 200 + 1;
                double carB = random.nextDouble() * 200 + 1;
                double carC = random.nextDouble() * 200 + 1;
                if (drawnShapeKind == 0)
                        return new Opel(carA);
                else if (drawnShapeKind == 1)
                        return new Toyota(carB);
                else
                        return new Ford(carC);
        }
}