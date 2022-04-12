package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class CarTestSuite {
    @Test
    public void testCarType() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("createCar");
        Assertions.assertEquals("Sedan",car.getCarType());
        //Assertions.assertTrue(car.hasHeadlightsTurnedOn());
        //Assertions.assertFalse(car.hasHeadlightsTurnedOn());
        // tutaj w zależności od godziny uruchomienia testu, bo pobiera actualtime
    }
}