package com.kodilla.stream.homework;

public class WarehouseApp {
        public static void main(String[] args) throws OrderDoesntExistException {
            Warehouse warehouse = new Warehouse();
            warehouse.addOrder(new Order("Order1"));
            warehouse.addOrder(new Order("Order2"));
            warehouse.addOrder(new Order("Order3"));
            warehouse.addOrder(new Order("Order4"));


            try {
                warehouse.isOrderUse("Order6");
            } catch (OrderDoesntExistException e) {
                System.out.println("The order doesn't exist. Please try another number.");
            } finally {
                System.out.println("You find your order. Check another one.");
            }
        }

}
