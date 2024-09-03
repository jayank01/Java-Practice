package com.epam.basics.java8.java8.Design_Patterns.Singleton_Pattern;

public class Synchronized {

    private static Synchronized instance;

    private Synchronized() {
    }

    public static synchronized Synchronized getInstance() {
        if(instance == null) {
            instance = new Synchronized();
        }
        return instance;
    }
}
