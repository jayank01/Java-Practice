package com.epam.basics.java8.java8.Design_Patterns.Singleton_Pattern;

public class DoubleCheckedLocking {

    private static volatile DoubleCheckedLocking instance;

    private DoubleCheckedLocking() {
    }

    public static DoubleCheckedLocking getInstance() {
        if(instance == null) { // check one
            synchronized(DoubleCheckedLocking.class) { //protection from multiple threads
                if(instance == null) { // check two
                    instance = new DoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}
