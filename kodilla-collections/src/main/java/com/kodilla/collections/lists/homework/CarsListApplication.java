package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car toyota = new Toyota(30);
        cars.add(toyota);
        cars.add(new Toyota(100));
        cars.add(new Opel(60));
        cars.add(new Ford(70));

        cars.remove(1);
        cars.remove(toyota);

        for (int n = 0; n < cars.size(); n++) {
            CarUtils.describeCar(cars.get(n));
            System.out.println(cars.size());
        }
    }
}


