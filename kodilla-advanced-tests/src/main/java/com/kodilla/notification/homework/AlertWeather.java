package com.kodilla.notification.homework;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AlertWeather {
    private Map<Location, Set<Customer>> subscribers = new HashMap<>();
    private Set<Customer> customers = new HashSet<>();


    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public void addSubscriber(Customer newCustomer, Location location) {
        Set<Customer> helper = this.subscribers.get(location);
        if (helper == null){
            helper = new HashSet<>();
            helper.add(newCustomer);
        }
        helper.add(newCustomer);
        this.subscribers.put(location,helper);
    }

    public void sendNotificationToAll(Notification notification){
        this.customers.forEach(customer -> customer.receive(notification));

    }
    public void sendNotificationToLocalization(Notification notification, Location location) {
        Set<Customer> helper = this.subscribers.get(location);
        if (helper == null) {
            return;
        }
        helper.forEach(customer -> customer.receive(notification));
    }

    public void removeCustomerFromLocalization(Customer customer, Location location){
        Set<Customer> helper = this.subscribers.get(location);
        if (helper == null) {
            return;
        }
        helper.remove(customer);
        this.subscribers.put(location, helper);

    }

    public void removeSubscriber(Customer customer){
        Set<Location> suspectedLocations = new HashSet<>();
        this.subscribers.forEach((location, customers) -> {
            if (customers.contains(customer)){
                suspectedLocations.add(location);
            }
        });

        suspectedLocations.forEach(location -> removeCustomerFromLocalization(customer, location));
    }
    public void removeLocalization(Location location){
        this.subscribers.remove(location);

    }
}

