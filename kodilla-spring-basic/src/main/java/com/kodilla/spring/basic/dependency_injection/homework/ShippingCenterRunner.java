package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenterRunner {
    private Service service;

    public ShippingCenterRunner(Service service) {
        this.service = service;
    }


    public void sendPackage(String address, double weight) {
        if (this.service.deliver(address, weight)){
            this.service = new NotificationService();
            this.service.deliver(address, weight);
        } else{
            this.service = new NotificationService();
            this.service.deliver(address, weight);
        }
    }
}
