package com.factorypattern;

public class Dell extends Laptop{
        private String ramSize;
        private String processorType;

    Dell(String ramSize, String processorType){
            this.ramSize = ramSize;
            this.processorType = processorType;
        }

        @Override
        public String getConfiguration() {
            return "Dell config is ram size:" + this.ramSize + "and processor type is" + this.processorType;
        }

        @Override
        public String toString() {
            return "Dell{" +
                    "ramSize='" + ramSize + '\'' +
                    ", processorType='" + processorType + '\'' +
                    '}';
        }
}
