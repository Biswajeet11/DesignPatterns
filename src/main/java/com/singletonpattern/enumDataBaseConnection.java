package com.singletonpattern;

public enum enumDataBaseConnection {
    INSTANCE;

    private String dbURL = "https://something";
    public String getDbURL(){
        return dbURL;
    }
}
