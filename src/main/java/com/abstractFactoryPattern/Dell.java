package com.abstractFactoryPattern;

public class Dell extends Device {
    private String ramSize;
    private String processorType;
    private String gpu;

    Dell(String ramSize, String processorType, String gpu){
        this.ramSize = ramSize;
        this.processorType = processorType;
        this.gpu = gpu;
    }

    @Override
    public String getDetails() {
        return "Dell config is ram size:" + this.ramSize + "and processor type is" + this.processorType + "gpu is" + this.gpu;
    }

    @Override
    public String toString() {
        return "Dell{" +
                "ramSize='" + ramSize + '\'' +
                ", processorType='" + processorType + '\'' +
                "ramSize='"+ gpu +
                '}';
    }
}
