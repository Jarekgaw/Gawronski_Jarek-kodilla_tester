package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.collections.arrays.homework.CarUtils.describeCar;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car Toyota = new Toyota(30);
        cars.add(Toyota);
        cars.add(new Toyota(100));
        cars.add(new Opel(60));
        cars.add(new Ford(70));

        cars.remove(1);
        cars.remove(Toyota);

        for (int n = 0; n < cars.size(); n++) {
            describeCar();
            System.out.println(cars.size());
        }
    }

    private static void describeCar() {
    }
}


