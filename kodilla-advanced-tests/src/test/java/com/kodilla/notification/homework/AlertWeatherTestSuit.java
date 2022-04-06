package com.kodilla.notification.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class AlertWeatherTestSuit {
    AlertWeather alertWeather = new AlertWeather();
    Customer customer = Mockito.mock(Customer.class);
    Location location = Mockito.mock(Location.class);
    Notification notification = Mockito.mock(Notification.class);


    @Test
    void addCustomer() {
        alertWeather.addCustomer(customer);
        alertWeather.sendNotificationToAll(notification);
        Mockito.verify(customer, Mockito.times(1)).receive(notification);
    }

    @Test
    void addSubscriber() {
        alertWeather.addSubscriber(customer,location);
        alertWeather.sendNotificationToLocalization(notification,location);
        Mockito.verify(customer, Mockito.times(1)).receive(notification);
    }

    @Test
    void sendNotificationToAll() {
        alertWeather.addCustomer(customer);
        alertWeather.sendNotificationToAll(notification);
        Mockito.verify(customer, Mockito.times(1)).receive(notification);

    }

    @Test
    void sendNotificationToLocalization() {
        alertWeather.addCustomer(customer);
        Location location2 = Mockito.mock(Location.class);
        alertWeather.addSubscriber(customer, location2);
        alertWeather.sendNotificationToLocalization(notification, location2);
        Mockito.verify(customer, Mockito.times(1)).receive(notification);
    }

    @Test
    void removeCustomerFromLocalization() {
        alertWeather.removeCustomerFromLocalization(customer,location);
        alertWeather.sendNotificationToLocalization(notification,location);
        Mockito.verify(customer, Mockito.never()).receive(notification);

    }

    @Test
    void removeSubscriber() {
        alertWeather.addSubscriber(customer,location);
        alertWeather.sendNotificationToLocalization(notification,location);
        Mockito.verify(customer, Mockito.times(1)).receive(notification);

        alertWeather.removeSubscriber(customer);
        alertWeather.sendNotificationToLocalization(notification,location);
        Mockito.verify(customer, Mockito.times(1)).receive(notification);
    }

    @Test
    void removeLocalization() {
        alertWeather.addSubscriber(customer,location);
        alertWeather.sendNotificationToLocalization(notification,location);
        Mockito.verify(customer, Mockito.times(1)).receive(notification);

        alertWeather.removeLocalization(location);
        alertWeather.sendNotificationToLocalization(notification,location);
        Mockito.verify(customer, Mockito.times(1)).receive(notification);
    }
}