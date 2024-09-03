package com.epam.basics.java8.java8.Design_Patterns.Singleton_Pattern;

public class EagerInitialization {

    private static final EagerInitialization instance = new EagerInitialization();

    private EagerInitialization() {
    }

    public static EagerInitialization getInstance() {
        return instance;
    }
}
