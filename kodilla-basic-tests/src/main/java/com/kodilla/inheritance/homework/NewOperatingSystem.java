package com.kodilla.inheritance.homework;

public class NewOperatingSystem extends OperatingSystem {
    @Override
    public void turnOn() {
        System.out.println("Year start new production" + getYearOn());
    }
    @Override
    public void turnOff() {
        System.out.println("This operating system is old");
    }
    public NewOperatingSystem(int yearOn, int yearOff) {
        super(yearOn, yearOff);
        System.out.println();
    }
}
