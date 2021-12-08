package com.factorypattern;

public class Mac extends Laptop {
    private String ramSize;
    private String processorType;
    private String gpu;

    Mac(String ramSize, String processorType, String gpu){
        this.ramSize = ramSize;
        this.processorType = processorType;
        this.gpu = gpu;
    }

    @Override
    public String getConfiguration() {
        return "Mac config is ram size:" + this.ramSize + "and processor type is" + this.processorType + "gpu:" + this.gpu;
    }

    @Override
    public String toString() {
        return "Mac{" +
                "ramSize='" + ramSize + '\'' +
                ", processorType='" + processorType + '\'' +
                '}';
    }
}
