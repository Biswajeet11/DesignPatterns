package com.abstractFactoryPattern;

public class OnePlus extends Device{
    private String ramSize;
    private String processorType;

    OnePlus(String ramSize, String processorType){
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    @Override
    public String getDetails() {
        return "OnePlus config is ram size:" + this.ramSize + "and processor type is" + this.processorType;
    }

    @Override
    public String toString() {
        return "OnePlus{" +
                "ramSize='" + ramSize + '\'' +
                ", processorType='" + processorType + '\'' +
                '}';
    }
}
