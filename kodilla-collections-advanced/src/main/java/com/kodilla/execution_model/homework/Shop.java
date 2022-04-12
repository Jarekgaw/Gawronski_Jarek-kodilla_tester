package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {
    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }
    public Set<Order> getOrdersBetweenDates(LocalDate dateFrom,LocalDate dateTo){
        return orders
                .stream()
                .filter(u -> u.getDate().isBefore(dateTo))
                .filter(u -> u.getDate().isAfter(dateFrom))
                .collect(Collectors.toSet());
    }
    public Set<Order> getOrdersBetweenValues(double minValue, double maxValue){
        return orders
                .stream()
                .filter(u -> u.getValue()<maxValue)
                .filter(u -> u.getValue()>minValue)
                .collect(Collectors.toSet());

    }
    public int getSize() {
        return this.orders.size();
    }
    public double getOrderSumValues(){
        return orders
                .stream()
                .reduce(0.0, (sum, order) -> sum + order.getValue(), Double::sum);

    }
}

