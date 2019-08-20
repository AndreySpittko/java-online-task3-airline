package com.epam.airlineOOP.airlines;

import com.epam.airlineOOP.aircraft.Aircraft;

import java.util.ArrayList;
import java.util.List;

public class Airline {
    private List<Aircraft> aircrafts = new ArrayList<>();
    private Long price;

    public List<Aircraft> getAircrafts() {
        return aircrafts;
    }

    public void setAircrafts(List<Aircraft> aircrafts) {
        this.aircrafts = aircrafts;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
