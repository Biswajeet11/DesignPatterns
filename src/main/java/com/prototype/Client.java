package com.prototype;

import java.util.List;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException{
        Flight flight = new Flight();
        flight.loadDefaultFlightList();

        Flight morningFlights = (Flight) flight.clone();
        List<String> morningFlightList = morningFlights.getDefaultFlightList();
        morningFlightList.add("Qatar Airways");

        Flight nightFlights = (Flight) flight.clone();
        List<String> nightFlightList = nightFlights.getDefaultFlightList();
        nightFlightList.remove("Fly Dubai");

        System.out.println("Default Flight list"+flight.getDefaultFlightList());
        System.out.println("morningFlights Flight list"+morningFlights.getDefaultFlightList());
        System.out.println("nightFlights Flight list"+nightFlights.getDefaultFlightList());
        System.out.println("Default Flight list"+flight.getDefaultFlightList());
    }
}
