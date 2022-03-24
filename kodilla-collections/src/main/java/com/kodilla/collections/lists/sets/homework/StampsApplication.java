package com.kodilla.collections.lists.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Local", "Small", true));
        stamps.add(new Stamp("External", "Large", false));
        stamps.add(new Stamp("Internationa", "Big", true));
        stamps.add(new Stamp("Local", "Small", true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }

}
