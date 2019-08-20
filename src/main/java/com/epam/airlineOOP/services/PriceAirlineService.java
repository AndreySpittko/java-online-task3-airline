package com.epam.airlineOOP.services;

import com.epam.airlineOOP.aircraft.Aircraft;
import com.epam.airlineOOP.airlines.Airline;
import com.epam.airlineOOP.services.aircraftService.AircraftGenerator;

public class PriceAirlineService {
    private AircraftGenerator aircraftGenerator = new AircraftGenerator();

    public void generatePrice(Airline airline) {
        Long price = 0L;
        for (Aircraft aircraft : airline.getAircrafts()) {
            price += aircraftGenerator.getPrice(aircraft.getType());
        }
        airline.setPrice(price);
    }
}
