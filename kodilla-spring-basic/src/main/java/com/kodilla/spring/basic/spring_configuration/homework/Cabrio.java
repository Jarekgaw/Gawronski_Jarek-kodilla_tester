package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalDateTime;

public class Cabrio implements Car{

    @Override
    public boolean hasHeadlightsTurnedOn() {
        LocalDateTime now = LocalDateTime.now();
        int time = now.getHour();
        if (20 > time && time > 6) {
            return false;
        }
        else {
            return true;
        }

    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}
