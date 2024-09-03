package com.epam.basics.java8.java8.Design_Patterns.Strategy_Pattern;

import com.epam.basics.java8.java8.Design_Patterns.Strategy_Pattern.strategy.DriveStrategy;

public class Vehicle {

    private final DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
