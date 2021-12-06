package com.builderpattern;

import com.builderpattern.builder.CarWithBuilder;
import com.builderpattern.carcomponents.*;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Engine engine =new Engine();
        Fuel fuel = new Fuel();
        Stearing stearing = new Stearing();
        AirBags airbags = new AirBags();
        List<Seat> seats = new ArrayList<>();
        MusicSystem musicSystem = new MusicSystem();
        CentralLock centralLock = new CentralLock();

        /**
         * Object remains immutable after it is build
         *
         *
         * */

         // create a car with only essential items

        CarWithBuilder car = new CarWithBuilder.Builder()
                .withEngine(engine)
                .withFuel(fuel)
                .withSeats(seats)
                .withStearing(stearing)
                .build();


    }
}
