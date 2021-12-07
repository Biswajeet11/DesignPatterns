package com.decorator;

public class WrapBase implements SubwayWrap {

    @Override
    public int getCost() {
        return 100;
    }

    @Override
    public String getComposition() {
        return "Subway wrap base";
    }
}
