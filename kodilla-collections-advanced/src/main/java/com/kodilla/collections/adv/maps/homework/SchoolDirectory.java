package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<School, Principal> schoolDirector = new HashMap<>();
        School firstLO = new School(200);
        School tenLO = new School(230);
        School nineLO = new School(150);

        Principal kowalski = new Principal("Kowalski");
        Principal adamska = new Principal("Adamska");
        Principal tomaszewski = new Principal("Tomaszewski");

        schoolDirector.put(firstLO, kowalski);
        schoolDirector.put(tenLO, adamska);
        schoolDirector.put(nineLO, tomaszewski);


        for (Map.Entry<School, Principal> schoolEntry : schoolDirector.entrySet()) {
            System.out.println(schoolDirector.entrySet());
        }
    }
}
