package com.factorypattern;

public class LaptopFactory {
    public static Laptop getLaptop(LaptopType laptopType){
        switch (laptopType){
            case MAC:
                return new Mac("8GB", "Intel", "amd");
            case DELL:
                new Dell("16GB","Intel");
        }
        return null;
    }
}
