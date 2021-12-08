package com.abstractFactoryPattern;

public class Client {
    public static void main(String[] args) {
        Device dell = FactoryGenerator.getFactory(FactoryType.LAPTOPFACTORY).getGadget(DeviceType.DELL);
        System.out.println(dell.getDetails());

        AbstractDeviceFactory mobile = FactoryGenerator.getFactory(FactoryType.MOBILEFACTORY);
        Device nokia = mobile.getGadget(DeviceType.NOKIA);
        System.out.println(nokia.getDetails());
        System.out.println(nokia.toString());


    }
}
