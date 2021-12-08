package com.prototype;

import java.util.ArrayList;
import java.util.List;

public class Flight implements Cloneable{
    private List<String> defaultFlightList;

    Flight(){
        this.defaultFlightList = new ArrayList<>();
    }

    Flight(List<String> list){
        this.defaultFlightList = list;
    }
    public void loadDefaultFlightList(){
        defaultFlightList.add("AirIndia");
        defaultFlightList.add("Indigo");
        defaultFlightList.add("AirAsia");
        defaultFlightList.add("Vistara");
        defaultFlightList.add("Fly Dubai");
    }

    public List<String> getDefaultFlightList() {
        return defaultFlightList;
    }

    public Object clone() throws CloneNotSupportedException{
        List<String> temp = new ArrayList<>();
        for(String s : this.getDefaultFlightList()){
            temp.add(s);
        }
        return new Flight(temp);
    }
}
