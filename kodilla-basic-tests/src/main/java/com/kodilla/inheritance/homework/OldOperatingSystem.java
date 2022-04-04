package com.kodilla.inheritance.homework;

public class OldOperatingSystem extends OperatingSystem{
    @Override
    public void turnOff() {
        System.out.println("This operating system is old");
    }
    @Override
    public void turnOn() {
        System.out.println("Year start new production" + getYearOn());
    }
    public OldOperatingSystem(int yearOn, int yearOff) {
        super(yearOn, yearOff);

    }
}
