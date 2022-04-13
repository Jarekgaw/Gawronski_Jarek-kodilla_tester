package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class CarFactory {

    @Bean
    public Car createCar() {
        LocalDateTime now = LocalDateTime.now();
        int month = now.getMonthValue();
        if (month == 6 || month == 7 || month == 8) {
            return new Cabrio();
        }
        if (month == 12 || month == 1 || month == 2) {
            return new SUV();
        }
        else  {
            return new Sedan();
        }
    }
}
