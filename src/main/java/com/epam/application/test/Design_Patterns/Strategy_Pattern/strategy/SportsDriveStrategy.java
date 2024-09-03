package com.epam.basics.java8.java8.Design_Patterns.Strategy_Pattern.strategy;

public class SportsDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("sports drive capability");
    }
}
