package com.kodilla.spring.basic.dependency_injection.homework;

public class AutoDeliveryService implements DeliveryService {

    @Override
    public boolean deliveryPackage(String address, double weight) {
       if (weight > 10 && weight < 150) {
           System.out.println("Package delivered by car");
    }else{
           System.out.println("Package not delivered by car");
       }
       return true;
}
}
