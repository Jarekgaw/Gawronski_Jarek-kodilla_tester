package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(50,20);
        doRace(ford);

        Toyota toyota = new Toyota(40, 20);
        doRace(toyota);

        Opel opel = new Opel(50, 30);
        doRace(opel);
    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.decreaseSpeed();

    }
}

