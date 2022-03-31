package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {
    public static void main(String[] args) {
        Service service = new DeliveryService();
        ShippingCenterRunner shippingCenterRunner = new ShippingCenterRunner(service);
        shippingCenterRunner.sendPackage("Hill Street 11, New York", 18.2);

    }
}
