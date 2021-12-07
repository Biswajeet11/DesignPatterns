package com.decorator;

public class Client {
    public static void main(String[] args) {
        SubwayWrap subwayWrap = new PaneerTopping(
                new CheeseTopping(
                        new WrapBase()
                )
        );

        System.out.println(subwayWrap.getCost());
        System.out.println(subwayWrap.getComposition());
    }
}
