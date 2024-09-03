package com.epam.basics.java8.java8.Design_Patterns.Strategy_Pattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new GoodsVehicle();
        vehicle.drive();
        vehicle = new SportVehicle();
        vehicle.drive();
        vehicle = new OffRoadingVehicle();
        vehicle.drive();
    }
}
