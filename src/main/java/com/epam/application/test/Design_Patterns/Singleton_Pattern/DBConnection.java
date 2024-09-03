package com.epam.basics.java8.java8.Design_Patterns.Singleton_Pattern;

public enum DBConnection {
    INSTANCE;

    public void getConnection() {
        System.out.println("Connection established");
    }
}
