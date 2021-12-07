package com.decorator;

public class PaneerTopping implements SubwayWrap{
    SubwayWrap subwayWrap;

    PaneerTopping(SubwayWrap subwayWrap){
        this.subwayWrap=subwayWrap;
    }

    @Override
    public int getCost() {
        return subwayWrap.getCost()+50;
    }

    @Override
    public String getComposition() {
        return subwayWrap.getComposition()+" "+ "Paneer Topping";
    }
}
