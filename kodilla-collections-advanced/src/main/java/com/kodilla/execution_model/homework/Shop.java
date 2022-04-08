package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }
    public List<Order> getOrdersBetweenDates(LocalDate date1,LocalDate date2){
        return orders
                .stream()
                .filter(u -> u.getDate().isBefore(date2))
                .filter(u -> u.getDate().isAfter(date1))
                .collect(Collectors.toList());
    }
    public List<Order> getOrdersBetweenValues(double value1, double value2){
        return orders
                .stream()
                .filter(u -> u.getValue()<value2)
                .filter(u -> u.getValue()>value1)
                .collect(Collectors.toList());

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

