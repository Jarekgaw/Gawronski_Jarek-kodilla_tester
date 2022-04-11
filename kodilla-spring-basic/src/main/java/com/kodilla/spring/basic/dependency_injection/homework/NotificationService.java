package com.kodilla.spring.basic.dependency_injection.homework;

public class NotificationService implements Service {


    @Override
    public boolean deliver(String address, double weight) {
        if (weight > 30) {
            System.out.println("Package not delivered to: " + address);
            return false;
        }
        System.out.println("Package delivered to: " + address);
        return true;
    }
}
