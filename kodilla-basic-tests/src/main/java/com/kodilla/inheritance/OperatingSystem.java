package com.kodilla.inheritance;

public class OperatingSystem {
    private int yearOn;
    private int yearOff;

    public OperatingSystem(int yearOn,int yearOff) {
        this.yearOn = yearOn;
        this.yearOff = yearOff;
    }
    public void turnOn() {
        System.out.println("Year of publishing " +yearOn);
    }
    public void turnOff() {
        System.out.println("End publishing year " +yearOff);
    }
    public int getYearOn() {
        return yearOn;
    }
    public int getYearOff() {
        return yearOff;
    }
}
