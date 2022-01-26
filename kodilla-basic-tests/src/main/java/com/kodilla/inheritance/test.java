package com.kodilla.inheritance;

public class test {
    public static void main(String[] args) {
        OperatingSystem year = new OperatingSystem();
        year.yearOn = 1987;
        year.yearOff = 2000;
        System.out.println(year.yearOn + " " +year.yearOff);
        year.turnOn();
        year.turnOff();


    }
}
