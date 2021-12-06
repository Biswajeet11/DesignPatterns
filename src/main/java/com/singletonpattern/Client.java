package com.singletonpattern;

public class Client {
    public static void main(String[] args) {
        DataBaseConnection db1 =  DataBaseConnection.getInstance();

    /*
      Enum singleton
       enum is thread safe and serialized by default in java
     */

    /*
     obj1 and obj2 have the same address and are same
     */

        enumDataBaseConnection obj1 = enumDataBaseConnection.INSTANCE;
        obj1.getDbURL();

        enumDataBaseConnection obj2 = enumDataBaseConnection.INSTANCE;
        obj1.getDbURL();
    }

}
