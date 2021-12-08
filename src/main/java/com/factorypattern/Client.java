package com.factorypattern;

public class Client {
    public static void main(String[] args) {
         // if we need to add new arguments in mac in future we have to modify mac class
        //        Laptop mac = new Mac("8GB", "Intel", "amd");
       //        Laptop dell = new Dell("16GB","Intel");
      //        System.out.println(mac.toString());

        Laptop mac  = LaptopFactory.getLaptop(LaptopType.MAC);
        Laptop dell = LaptopFactory.getLaptop(LaptopType.DELL);

        System.out.println(mac.toString());
        System.out.println(dell.toString());

    }
}
