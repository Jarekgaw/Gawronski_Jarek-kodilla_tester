package com.kodilla.spring.basic.dependency_injection.homework;

public class MotorbikeDeliveryService implements DeliveryService {

    @Override
    public boolean deliveryPackage(String address, double weight) {
        if (weight > 10) {
            System.out.println("Package too heavy for motorbike delivering");
            return false;
        }
        System.out.println("Package delivery by motorbike");
        return true;
    }
}
