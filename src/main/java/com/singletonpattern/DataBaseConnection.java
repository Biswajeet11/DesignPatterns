package com.singletonpattern;

public class DataBaseConnection {

    /*  initially the instance will be null when no instances are made for the connection
    *  we should not create multiple connection or instances of connection for the database
    */
    private static DataBaseConnection INSTANCE = null;
    /*
    * 1. Here the variable INSTANCE can't  be declared final as the variable can be assigned
         only once at the time of initialization.
      2. The variable is declared as static as the variable
         gets memory only once in the class area at the time of class loading.
      */



    private DataBaseConnection(){

    }

    /*
       Why are we not doing this in constructor ?
          Contructor always constructs a new instance in the constructor and you cant return anything
       */
    public static synchronized  DataBaseConnection getInstance(){
        if(INSTANCE == null) {
            INSTANCE = new DataBaseConnection();
        }
        return INSTANCE;
    }


}
