package com.epam.basics.java8.java8.Design_Patterns.Strategy_Pattern.strategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("normal drive capability");
    }
}
