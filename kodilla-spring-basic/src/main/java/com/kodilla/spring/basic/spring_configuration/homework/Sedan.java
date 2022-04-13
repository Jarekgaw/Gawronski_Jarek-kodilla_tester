package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalDateTime;

public class Sedan implements Car {
    @Override
    public boolean hasHeadlightsTurnedOn() {
        LocalDateTime now = LocalDateTime.now();
        int time = now.getHour();
        return 20 > time && time > 6;
        }

        @Override
        public String getCarType () {
            return "Sedan";
        }
    }

