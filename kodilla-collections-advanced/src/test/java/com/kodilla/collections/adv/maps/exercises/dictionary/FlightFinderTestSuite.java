package com.kodilla.collections.adv.maps.exercises.dictionary;

import com.kodilla.collections.adv.exercises.homework.Flight;
import com.kodilla.collections.adv.exercises.homework.FlightFinder;
import com.kodilla.collections.adv.exercises.homework.FlightRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderTestSuite {
    @Test

    public void testFlightFinder() {
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFlightsFrom("Berlin");

    }
    List<Flight> result = "Berlin";
}
