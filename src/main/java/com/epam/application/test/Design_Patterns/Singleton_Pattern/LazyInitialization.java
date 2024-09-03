package com.epam.basics.java8.java8.Design_Patterns.Singleton_Pattern;

public class LazyInitialization {

    private static LazyInitialization instance;

    private LazyInitialization() {
    }

    public static LazyInitialization getInstance() {
        if(instance == null) {
            instance = new LazyInitialization();
        }
        return instance;
    }
}
