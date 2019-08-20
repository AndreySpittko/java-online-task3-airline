package com.epam.airlineOOP.services.aircraftService;

import com.epam.airlineOOP.aircraft.aircraftProperties.CargoAircraftType;

import java.util.HashMap;
import java.util.Map;

public class AircraftGenerator {
    private static Map<CargoAircraftType, Integer> cruisingSpeed = new HashMap<>();
    private static Map<CargoAircraftType, Integer> volume = new HashMap<>();
    private static Map<CargoAircraftType, Integer> weight = new HashMap<>();
    private static Map<CargoAircraftType, Integer> flightRange = new HashMap<>();
    private static Map<CargoAircraftType, Integer> price = new HashMap<>();

    static {
        cruisingSpeed.put(CargoAircraftType.AIRBUS_A300_600F, 844);
        cruisingSpeed.put(CargoAircraftType.AIRBUS_A330_200F, 871);
        cruisingSpeed.put(CargoAircraftType.AIRBUS_BELUGA, 850);
        cruisingSpeed.put(CargoAircraftType.BOEING_747_8F, 908);
        cruisingSpeed.put(CargoAircraftType.BOEING_777_FREIGHTER, 896);
    }

    static {
        volume.put(CargoAircraftType.AIRBUS_A300_600F, 116);
        volume.put(CargoAircraftType.AIRBUS_A330_200F, 475);
        volume.put(CargoAircraftType.AIRBUS_BELUGA, 1_210);
        volume.put(CargoAircraftType.BOEING_747_8F, 855);
        volume.put(CargoAircraftType.BOEING_777_FREIGHTER, 653);
    }

    static {
        weight.put(CargoAircraftType.AIRBUS_A300_600F, 48_000);
        weight.put(CargoAircraftType.AIRBUS_A330_200F, 70_000);
        weight.put(CargoAircraftType.AIRBUS_BELUGA, 47_000);
        weight.put(CargoAircraftType.BOEING_747_8F, 134_200);
        weight.put(CargoAircraftType.BOEING_777_FREIGHTER, 103_000);
    }

    static {
        flightRange.put(CargoAircraftType.AIRBUS_A330_200F, 7_400);
        flightRange.put(CargoAircraftType.AIRBUS_A300_600F, 7_400);
        flightRange.put(CargoAircraftType.AIRBUS_BELUGA, 4_632);
        flightRange.put(CargoAircraftType.BOEING_747_8F, 8_288);
        flightRange.put(CargoAircraftType.BOEING_777_FREIGHTER, 9_070);
    }

    static {
        price.put(CargoAircraftType.AIRBUS_A330_200F, 203_600_000);
        price.put(CargoAircraftType.AIRBUS_A300_600F, 105_000_000);
        price.put(CargoAircraftType.AIRBUS_BELUGA, 183_000_000);
        price.put(CargoAircraftType.BOEING_747_8F, 319_500_000);
        price.put(CargoAircraftType.BOEING_777_FREIGHTER, 300_500_000);
    }

    public Integer getCruisingSpeed(CargoAircraftType type){
        return cruisingSpeed.get(type);
    }

    public Integer getVolume(CargoAircraftType type){
        return volume.get(type);
    }

    public Integer getWeight(CargoAircraftType type){
        return weight.get(type);
    }

    public Integer getFlightRange(CargoAircraftType type){
        return flightRange.get(type);
    }

    public Integer getPrice(CargoAircraftType type){
        return price.get(type);
    }
}
