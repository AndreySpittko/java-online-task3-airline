package com.epam.airlineOOP.services;

import com.epam.airlineOOP.aircraft.Aircraft;
import com.epam.airlineOOP.airlines.Airline;
import com.epam.airlineOOP.services.aircraftService.AircraftGenerator;
import com.epam.airlineOOP.services.invoiceService.SortedType;

import java.util.*;

public class AirlineService {
    private AircraftGenerator aircraftGenerator = new AircraftGenerator();

    private static final Comparator<Aircraft> BY_CRUISING_SPEED =
            (Aircraft a1, Aircraft a2) -> a1.getCruisingSpeed() - a2.getCruisingSpeed();

    private static final Comparator<Aircraft> BY_MAX_FLIGHT_RANGE =
            (Aircraft a1, Aircraft a2) -> a1.getMaxFlightRange() - a2.getMaxFlightRange();

    private static final Comparator<Aircraft> BY_PRICE =
            (Aircraft a1, Aircraft a2) -> a1.getPrice() - a2.getPrice();

    private static final Comparator<Aircraft> BY_VOLUME_OF_CARGO =
            (Aircraft a1, Aircraft a2) -> a1.getVolumeOfCargo() - a2.getVolumeOfCargo();

    private static final Comparator<Aircraft> BY_WEIGHT_OF_CARGO =
            (Aircraft a1, Aircraft a2) -> a1.getWeightOfCargo() - a2.getWeightOfCargo();


    public void addAircraft(Airline airline, List<Aircraft> aircrafts) {
        List<Aircraft> aircraftList = new ArrayList<>(aircrafts);
        aircraftList
                .stream()
                .forEach((Aircraft aircraft) -> aircraft.setCruisingSpeed(aircraftGenerator.getCruisingSpeed(aircraft.getType())));

        aircraftList
                .stream()
                .forEach((Aircraft aircraft) -> aircraft.setMaxFlightRange(aircraftGenerator.getFlightRange(aircraft.getType())));

        aircraftList
                .stream()
                .forEach((Aircraft aircraft) -> aircraft.setPrice(aircraftGenerator.getPrice(aircraft.getType())));

        aircraftList
                .stream()
                .forEach((Aircraft aircraft) -> aircraft.setVolumeOfCargo(aircraftGenerator.getVolume(aircraft.getType())));

        aircraftList
                .stream()
                .forEach((Aircraft aircraft) -> aircraft.setWeightOfCargo(aircraftGenerator.getWeight(aircraft.getType())));

        airline.getAircrafts().addAll(aircrafts);
    }


    public void removeElement(Airline airline, int position) {
        List<Aircraft> aircrafts = airline.getAircrafts();
        if (aircrafts.size() >= position) {
            aircrafts.remove(position);
        } else {
            throw new IndexOutOfBoundsException("please enter correct number: [ >= 0 and <= " + airline.getAircrafts().size() + " ]");
        }
    }

    public void showSortedType() {
        SortedType[] values = SortedType.values();
        for (int i = 0; i < values.length; i++) {
            int counter = i + 1;
            System.out.print("#" + counter + ". " + values[i] + "\t");
        }
        System.out.println();
    }

    public void sorted(Airline airline, int position) {
        List<Aircraft> sortedAircraftList = airline.getAircrafts();
        switch (position) {
            case 1:
                Collections.sort(sortedAircraftList, BY_CRUISING_SPEED);
                break;
            case 2:
                Collections.sort(sortedAircraftList, BY_MAX_FLIGHT_RANGE);
                break;
            case 3:
                Collections.sort(sortedAircraftList, BY_PRICE);
                break;
            case 4:
                Collections.sort(sortedAircraftList, BY_VOLUME_OF_CARGO);
                break;
            case 5:
                Collections.sort(sortedAircraftList, BY_WEIGHT_OF_CARGO);
                break;
            default:
                System.out.println("Sorry! Failed to sort");
        }
        showAircrafts(sortedAircraftList);
    }

    public void showAirline(Airline airline) {
        int counter = 0;
        for (Aircraft aircraft : airline.getAircrafts()) {
            System.out.printf("#%d\t%s", counter, aircraft);
            counter++;
        }
    }

    public void showAircrafts(List<Aircraft> aircrafts) {
        int counter = 0;
        for (Aircraft aircraft : aircrafts) {
            System.out.printf("#%d\t%s", counter, aircraft);
            counter++;
        }
    }


}
