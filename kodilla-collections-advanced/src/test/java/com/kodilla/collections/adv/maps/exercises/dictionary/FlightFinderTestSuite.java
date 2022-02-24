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

    public void findFlightsFrom() {
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFlightsFrom("Berlin");
        List<Flight> result = flightFinder.findFlightsFrom("Berlin");
        assertEquals(1,result.size());

    }
    @Test

    public void testFindFlightsToReturnZero() {
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFlightsTo("Warsaw");
        List<Flight> result = flightFinder.findFlightsTo("Warsaw");
        assertEquals(0, result.size());


    }
}
