package com.abstractFactoryPattern;

public class Nokia extends Device {
    private String ramSize;
    private String processorType;

    Nokia(String ramSize, String processorType){
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    @Override
    public String getDetails() {
        return "Nokia config is ram size:" + this.ramSize + "and processor type is" + this.processorType;
    }

    @Override
    public String toString() {
        return "Nokia{" +
                "ramSize='" + ramSize + '\'' +
                ", processorType='" + processorType + '\'' +
                '}';
    }
}
