package com.epam.airlineOOP;

import com.epam.airlineOOP.aircraft.Aircraft;
import com.epam.airlineOOP.aircraft.aircraftProperties.CargoAircraftType;
import com.epam.airlineOOP.airlines.Airline;
import com.epam.airlineOOP.services.AirlineService;
import com.epam.airlineOOP.services.fileService.FileService;
import com.epam.airlineOOP.services.invoiceService.InvoiceService;
import com.epam.airlineOOP.services.PriceAirlineService;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StartAirline {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static PriceAirlineService priceAirlineService = new PriceAirlineService();
    private static AirlineService airlineService = new AirlineService();

    public static void main(String[] args) {
//        FileService fileService = new FileService();
//        fileService.getFileName();

        InvoiceService invoiceService = new InvoiceService();
//        invoiceService.showCatalog();
//        invoiceService.addInInvoice();
        invoiceService.runApplication();
//        invoiceService.info();


//        List<Aircraft> myAircraftList = new ArrayList<>();
//        myAircraftList.add(new Aircraft(CargoAircraftType.AIRBUS_A300_600F));
//        myAircraftList.add(new Aircraft(CargoAircraftType.AIRBUS_A330_200F));
//        myAircraftList.add(new Aircraft(CargoAircraftType.AIRBUS_BELUGA));
//        myAircraftList.add(new Aircraft(CargoAircraftType.BOEING_747_8F));
//        myAircraftList.add(new Aircraft(CargoAircraftType.BOEING_777_FREIGHTER));
//        myAircraftList.add(new Aircraft(CargoAircraftType.BOEING_777_FREIGHTER));
//
//
//        Airline myAirline = new Airline();
//        airlineService.addAircraft(myAirline, myAircraftList);
//        priceAirlineService.generatePrice(myAirline);
//        Long price = myAirline.getPrice();
//        System.out.println("price: " + price);
//        System.out.printf("price: %,d\n", price);
//
//        System.out.println(myAircraftList.toString());

//        switch ("A") {
//            case "A": {
//                System.out.println("A");
//                break;
//            }
//            case "B": {
//                System.out.println("B");
//            }
//            break;
//            case "C": {
//                System.out.println("C");
//            }
//            break;
//            case "D": {
//                System.out.println("D");
//            }
//            break;
//        }
    }


}
