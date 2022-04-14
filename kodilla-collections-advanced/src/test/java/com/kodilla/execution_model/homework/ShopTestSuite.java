package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTestSuite {

    Shop shop = new Shop();
    Order order1 = new Order(135.56, LocalDate.of(2021, 3, 12), "JanKowal");
    Order order2 = new Order(674.56, LocalDate.of(2022, 6, 7), "JannuszekKowalski");
    Order order3 = new Order(185.43, LocalDate.of(2021, 10, 21), "JankaKowal65");
    Order order4 = new Order(1357.26, LocalDate.of(2018, 12, 12), "JaninaKowalczak");
    Order order5 = new Order(145, LocalDate.of(2015, 3, 17), "JanuszKowalewski54");

    @Test

    public void shouldAddOrdersToShop() {
        assertEquals(0, shop.getSize());
        shop.addOrder(order1);
        assertEquals(1, shop.getSize());
    }


    @Test
    public void shouldGetOrdersBeetwenDates() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);
        Set<Order> expected = new HashSet<>();
        expected.add(order1);
        expected.add(order3);
        assertEquals(expected, shop.getOrdersBetweenDates(LocalDate.of(2021, 2, 10), LocalDate.of(2022, 3, 10)));
    }
    @Test
    public void shouldGetValueMinMax() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);
        Set<Order> expected = new HashSet<>();
        expected.add(order2);
        assertEquals(expected, shop.getOrdersBetweenValues(666, 700.00));
    }
    @Test
    public void shouldGetSize(){
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);
        assertEquals(5,shop.getSize());
    }

    @Test
    public void shouldGetValues(){
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);
        assertEquals(2497.81,shop.getOrderSumValues());

    }

}


