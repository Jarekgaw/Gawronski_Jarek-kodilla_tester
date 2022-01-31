package com.kodilla.inheritance.homework;

public class NewOperatingSystem extends OperatingSystem {

    public void TurnOn() {
        System.out.println("Year start new production" + getYearOn());
    }

    public NewOperatingSystem(int yearOn, int yearOff) {
        super(yearOn, yearOff);
        System.out.println();
    }
}
