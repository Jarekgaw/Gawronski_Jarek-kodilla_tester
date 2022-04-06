package com.kodilla.spring.basic.dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class CalculatorTestSuite {

    @Test
    public void shouldCalculate(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Assertions.assertEquals(5,bean.add(2.5, 2.5));
        Assertions.assertEquals(5,bean.divide(10, 2));
        Assertions.assertEquals(5,bean.subtract(7, 2));
        Assertions.assertEquals(5,bean.multiply(2, 2.5));
    }

}