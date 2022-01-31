package com.kodilla.inheritance.homework;

public class Application {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1987, 2000);
        operatingSystem.turnOn();
        operatingSystem.turnOff();

        NewOperatingSystem newOperatingSystem = new NewOperatingSystem(2021,2022);
        newOperatingSystem.nowySystem();

        OldOperatingSystem oldOperatingSystem = new OldOperatingSystem(1988, 2021);
        oldOperatingSystem.turnOff();
    }
}