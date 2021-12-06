package com.builderpattern.builder;

import com.builderpattern.carcomponents.*;

import java.util.List;

public class CarWithBuilder {

    // required properties of a car
    private Engine engine;
    private Fuel fuel;
    private List<Seat> seats;
    private Stearing stearing;


    //optional properties of a car
    private AirBags airbags;
    private MusicSystem musicSystem;
    private CentralLock centralLock;


    public static class Builder {
        // required properties of a car
        private Engine engine;
        private Fuel fuel;
        private List<Seat> seats;
        private Stearing stearing;

        //optional properties of a car
        private AirBags airBags;
        private MusicSystem musicSystem;
        private CentralLock centralLock;


        public Builder withEngine(Engine engine){
            this.engine = engine;
            return this;
        }

        public Builder withFuel(Fuel fuel){
            this.fuel = fuel;
            return this;
        }

        public Builder withStearing(Stearing stearing){
            this.stearing = stearing;
            return this;
        }

        public Builder withSeats(List<Seat> seats){
            this.seats = seats;
            return this;
        }

        public Builder withAirBags(AirBags airBags) {
            this.airBags = airBags;
            return this;
        }

        public Builder withCentralLock(CentralLock centralLock) {
            this.centralLock = centralLock;
            return this;
        }

        public Builder withMusicSystem(MusicSystem musicSystem) {
            this.musicSystem = musicSystem;
            return this;
        }

        public CarWithBuilder build (){
            if(this.engine == null || this.seats == null ||this.fuel == null || this.stearing == null){
                throw new RuntimeException("Required properties not present");
            }
            CarWithBuilder carbuild = new CarWithBuilder();
            carbuild.engine = engine;
            carbuild.fuel = fuel;
            carbuild.seats = seats;
            carbuild.airbags = airBags;
            carbuild.stearing = stearing;
            carbuild.centralLock = centralLock;
            carbuild.musicSystem = musicSystem;
            return carbuild;
        }


    }


}
