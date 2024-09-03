package com.epam.basics.java8.java8.Design_Patterns.Strategy_Pattern;

import com.epam.basics.java8.java8.Design_Patterns.Strategy_Pattern.strategy.SportsDriveStrategy;

public class SportVehicle extends Vehicle {

    public SportVehicle() {
        super(new SportsDriveStrategy());
    }
}
