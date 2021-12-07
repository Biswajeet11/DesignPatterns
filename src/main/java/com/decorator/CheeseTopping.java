package com.decorator;

public class CheeseTopping implements SubwayWrap {
    SubwayWrap subwayWrap;

    CheeseTopping(SubwayWrap subwayWrap){
        this.subwayWrap = subwayWrap;
    }

    @Override
    public int getCost() {
        return subwayWrap.getCost()+ 30;
    }

    @Override
    public String getComposition() {
        return subwayWrap.getComposition() + " " + "CheeseTopping";
    }
}
