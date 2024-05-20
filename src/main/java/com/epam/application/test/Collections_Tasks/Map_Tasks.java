package com.epam.application.test.Collections_Tasks;

import java.util.*;

public class Map_Tasks {
    public static void main(String[] args) {

        // Task 1:
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        };
        TreeMap<String, Double> map = new TreeMap<>(comp);
        map.put("delhi",2.0);
        map.put("kolkata",4.5);
        map.put("hyderabad",1.1);
        map.put("mumbai",1.5);
        System.out.println(map);

        // Task 2:
        Map<String, Double> copyMap = new HashMap<>(map);
        System.out.println(copyMap);

        // Task 3:
        // 1. Search a key and value
        // 2. Get key and value
        String str = "delhi";
        if( copyMap.containsKey("pune") ) {
            System.out.println(copyMap.get("pune"));
        }else {
            System.out.println(copyMap.get(str));
        }
        // 3. delete all elements
        copyMap.clear();
        System.out.println(copyMap);

        // Task 4:
        Map<String, Double> person = new HashMap<>();

        person.put("Bob", 6.0);
        person.put("Alice", 5.6);
        person.put("Charlie", 5.9);

        person.remove("Charlie");

        for( String key : person.keySet() ) {
            System.out.println( key + " " + person.get(key) );
        }

        String fromKey = "kolkata";
        String toKey = "delhi";

        Map<String, Double> cityPopulation = map.subMap(fromKey, toKey);
        System.out.println(cityPopulation);
    }
}
