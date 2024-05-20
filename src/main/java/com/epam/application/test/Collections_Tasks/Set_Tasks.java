package com.epam.application.test.Collections_Tasks;

import java.util.*;

class Vehicles{
    Set<String> vehicles;

    Vehicles() {
        vehicles = new LinkedHashSet<>();
    }

    public void addVehicle( String vehicle ) {
        vehicles.add(vehicle);
    }

    public void removeVehicle( String vehicle ) {
        vehicles.remove(vehicle);
    }

    public boolean containsVehicle( String vehicle ) {
        return vehicles.contains(vehicle);
    }

    public void printVehicles(){
        for( String vehicle : vehicles ) System.out.print(vehicle + " ");
        System.out.println();
    }
}
public class Set_Tasks {
    public static void main(String[] args) {

        // Task 1:
        Set<String> set = new HashSet<>(); // order is random
        set.add("January");
        set.add("February");
        set.add("March");
        set.add("April");
        set.add("May");
        set.add("June");
        set.add("July");
        set.add("August");
        set.add("September");
        set.add("October");
        set.add("November");
        set.add("December");
        Iterator<String> iterator1 = set.iterator();
        while(iterator1.hasNext()) {
//            if( iterator.next().equals("May") ) set.remove("May");
            System.out.print(iterator1.next() + " ");
        }
        System.out.println();

        // Task 2:
        Integer[] arr = {45,78,90,1,8,0,23};
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>(Arrays.asList(arr)); // order is not random
        Iterator<Integer> iterator2 = set1.iterator();
        while(iterator2.hasNext()) {
            System.out.print(iterator2.next() + " ");
        }
        System.out.println();
        TreeSet<Integer> set2 = new TreeSet<>(Arrays.asList(arr)); // sorted set.
        iterator2 = set2.iterator();
        while(iterator2.hasNext()){
            System.out.print(iterator2.next() + " ");
        }
        System.out.println();

        // Task 3:
        Vehicles v = new Vehicles();
        v.addVehicle("Car");
        v.addVehicle("Bike");
        v.addVehicle("Scooter");
        v.removeVehicle("Bike");
        System.out.println(v.containsVehicle("Car"));
        v.printVehicles();
    }
}
