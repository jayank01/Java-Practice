package com.epam.basics.java8.java8.Design_Patterns.Strategy_Pattern;

import com.epam.basics.java8.java8.Design_Patterns.Strategy_Pattern.strategy.SportsDriveStrategy;

public class OffRoadingVehicle extends Vehicle {

    public OffRoadingVehicle() {
        super(new SportsDriveStrategy());
    }
}
