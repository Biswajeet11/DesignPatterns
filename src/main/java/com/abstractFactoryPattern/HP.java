package com.abstractFactoryPattern;

public class HP extends Device {
    private String ramSize;
    private String processorType;

    HP(String ramSize, String processorType){
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    @Override
    public String getDetails() {
        return "HP config is ram size:" + this.ramSize + "and processor type is" + this.processorType;
    }

    @Override
    public String toString() {
        return "HP{" +
                "ramSize='" + ramSize + '\'' +
                ", processorType='" + processorType + '\'' +
                '}';
    }
}
