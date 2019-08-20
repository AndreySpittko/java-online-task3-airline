package com.epam.airlineOOP.services.invoiceService;

import com.epam.airlineOOP.aircraft.Aircraft;
import com.epam.airlineOOP.aircraft.aircraftProperties.CargoAircraftType;
import com.epam.airlineOOP.airlines.Airline;
import com.epam.airlineOOP.services.AirlineService;
import com.epam.airlineOOP.services.PriceAirlineService;
import com.epam.airlineOOP.services.fileService.FileService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InvoiceService {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static PriceAirlineService priceAirlineService = new PriceAirlineService();
    private static AirlineService airlineService = new AirlineService();
    private FileService fileService = new FileService();
//    private static Airline airline = new Airline();

    private static final String SELECT_NUMBER_OPERATION = "\tPlease an action by typing [0 - 6]:\t";

    public void runApplication() {
        int menuSize = MenuService.values().length;
        boolean continueLoop = true;
        Airline airline = new Airline();
        List<Aircraft> aircrafts = new LinkedList<>();
        showMenu();
        int param = inputNumber(br);
        while (param != 0) {
            switch (param) {
                case 1:
                    System.out.println("Add aircraft to your list:");
                    aircrafts = addInInvoice();
                    airlineService.addAircraft(airline, aircrafts);
                    System.out.print(SELECT_NUMBER_OPERATION);
                    showMenu();
                    param = inputNumber(br);
                    break;
                case 2:
                    System.out.println("Print elements!");
                    airlineService.showAirline(airline);
                    System.out.print(SELECT_NUMBER_OPERATION);
                    showMenu();
                    param = inputNumber(br);
                    break;
                case 3:
                    System.out.println("Delete element number ");
                    try {
                        airlineService.removeElement(airline, inputNumber(br));
                    } catch (IndexOutOfBoundsException e) {
                        e.printStackTrace();
                    }
                    System.out.print(SELECT_NUMBER_OPERATION);
                    param = inputNumber(br);
                    break;
                case 4:
                    System.out.println("Select the type of sorting");
                    airlineService.showSortedType();
                    airlineService.sorted(airline, inputNumber(br));
                    System.out.println(SELECT_NUMBER_OPERATION);
                    showMenu();
                    param = inputNumber(br);
                    break;
                case 5:
                    System.out.println("Print all elements");
                    System.out.println(SELECT_NUMBER_OPERATION);
                    param = inputNumber(br);
                    break;
                case 6:
                    System.out.println("Write your invoice in check-file!");
                    fileService.writer(airline.getAircrafts().toString());
                    System.out.print(SELECT_NUMBER_OPERATION);
                    showMenu();
                    param = inputNumber(br);
                    break;
                default:
                    param = 0;
                    break;
            }
        }
    }

    public List<Aircraft> addInInvoice() {
        List<Aircraft> myAircraftList = new ArrayList<>();
        int menuSize = CargoAircraftType.values().length;
        showCatalog();
        int param = inputNumber(br);
        switch (param) {
            case 0:
                System.out.println("You add to invoice: " + CargoAircraftType.BOEING_747_8F.toString());
                myAircraftList.add(new Aircraft(CargoAircraftType.BOEING_747_8F));
                break;
            case 1:
                System.out.println("You add to invoice: " + CargoAircraftType.BOEING_777_FREIGHTER.toString());
                myAircraftList.add(new Aircraft(CargoAircraftType.BOEING_777_FREIGHTER));
                break;
            case 2:
                System.out.println("You add to invoice: " + CargoAircraftType.AIRBUS_BELUGA.toString());
                myAircraftList.add(new Aircraft(CargoAircraftType.AIRBUS_BELUGA));
                break;
            case 3:
                System.out.println("You add to invoice: " + CargoAircraftType.AIRBUS_A300_600F.toString());
                myAircraftList.add(new Aircraft(CargoAircraftType.AIRBUS_A300_600F));
                break;
            case 4:
                System.out.println("You add to invoice: " + CargoAircraftType.AIRBUS_A330_200F.toString());
                myAircraftList.add(new Aircraft(CargoAircraftType.AIRBUS_A330_200F));
                break;
            default:
                System.out.println("You has entered incorrect id!");
                break;
        }
        return myAircraftList;
    }

    public void showCatalog() {
        CargoAircraftType[] values = CargoAircraftType.values();
        for (int i = 0; i < values.length; i++) {
            System.out.print("#" + i + ". " + values[i] + "\t");
        }
        System.out.println();
    }

    public void showMenu() {
        MenuService[] values = MenuService.values();
        for (int i = 0; i < values.length; i++) {
            System.out.print("#" + i + ". " + values[i] + "\t");
        }
        System.out.println();
    }

    private static int inputNumber(BufferedReader br) {
        int number = 0;
        boolean continueLoop = true;
        do {
            System.out.print("\tInput number: ");
            number = validateNumber(br);
            continueLoop = false;
            return number;
        } while (continueLoop);
    }

    private static int validateNumber(BufferedReader br) {
        int number = 0;
        boolean continueLoop = true;
        do {
            try {
                number = Integer.parseInt(br.readLine());
                continueLoop = false;
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("Exception " + e);
                e.printStackTrace();
                System.out.print("You input incorrect value! Please input Integer value: ");
            }
        } while (continueLoop);
        return number;
    }


}
