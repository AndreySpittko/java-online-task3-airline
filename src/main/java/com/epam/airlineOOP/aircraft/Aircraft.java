package com.epam.airlineOOP.aircraft;

import com.epam.airlineOOP.aircraft.aircraftProperties.CargoAircraftType;

public class Aircraft {
    private CargoAircraftType type;
    private int cruisingSpeed;
    private int volumeOfCargo;
    private int weightOfCargo;
    private int maxFlightRange;
    private int price;

    public Aircraft() {
    }

    public Aircraft(CargoAircraftType type) {
        this.type = type;
    }

    public CargoAircraftType getType() {
        return type;
    }

    public void setType(CargoAircraftType type) {
        this.type = type;
    }

    public int getCruisingSpeed() {
        return cruisingSpeed;
    }

    public void setCruisingSpeed(int cruisingSpeed) {
        this.cruisingSpeed = cruisingSpeed;
    }

    public int getVolumeOfCargo() {
        return volumeOfCargo;
    }

    public void setVolumeOfCargo(int volumeOfCargo) {
        this.volumeOfCargo = volumeOfCargo;
    }

    public int getWeightOfCargo() {
        return weightOfCargo;
    }

    public void setWeightOfCargo(int weightOfCargo) {
        this.weightOfCargo = weightOfCargo;
    }

    public int getMaxFlightRange() {
        return maxFlightRange;
    }

    public void setMaxFlightRange(int maxFlightRange) {
        this.maxFlightRange = maxFlightRange;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s: cruising Speed = %,d(km/h), volume of cargo = %,d(m3), weight of cargo = %,d(kg)," +
                        " max flight range = %,d(km), price = %,d($)\n",
                getType(), getCruisingSpeed(), getVolumeOfCargo(), getWeightOfCargo(), getMaxFlightRange(), getPrice());
    }


}
