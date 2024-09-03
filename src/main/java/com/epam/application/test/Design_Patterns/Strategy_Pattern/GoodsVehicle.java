package com.epam.basics.java8.java8.Design_Patterns.Strategy_Pattern;

import com.epam.basics.java8.java8.Design_Patterns.Strategy_Pattern.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {

    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
