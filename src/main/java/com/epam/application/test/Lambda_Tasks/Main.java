package com.epam.application.test.Lambda_Tasks;

import com.epam.application.test.Stream_API_Tasks.Employee;
import com.epam.application.test.Stream_API_Tasks.Employee_data;

import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // 1.
        String s = "abcdcba";
        Predicate<String> isPalindrome = (str) -> {
            int i = 0, j = str.length()-1;
            while( i < j ) {
                if( str.charAt(i) != str.charAt(j) ) return false;
                i++;
                j--;
            }
            return true;
        };
        System.out.println(isPalindrome.test(s));
        // 2.
        Integer[] arr = {45,78,90,1,8,0,95};
        List<Integer> list = Arrays.asList(arr);
        Function<List<Integer>,Integer> sndLargestNum = (l) -> {
            Integer max = Integer.MIN_VALUE, ans = Integer.MAX_VALUE;
            for( int i = 0 ; i < l.size() ; i++ ) {
                if( max < l.get(i) ) {
                    ans = max;
                    max = l.get(i);
                }else if( ans < l.get(i) ) {
                    ans = l.get(i);
                }
            }
            return ans;
        };
        System.out.println(sndLargestNum.apply(list));
        // 3.
        BiPredicate<String, String> rotations = (s1,s2) -> {
            int idx = -1;
            for( int i = 0 ; i < s2.length() ; i++ ) {
                if( s2.charAt(i) == s1.charAt(0) ) {
                    idx = i;
                    break;
                }
            }
            if( idx == -1 ) return false;
            String str = s2.substring(idx) + s2.substring(0,idx);
            if( !str.equals(s1) ) return false;
            return true;
        };
        System.out.println(rotations.test("ABCD","CDAB"));
        System.out.println(rotations.test("ABCD","ACBD"));
        // 4.
        Runnable r = () -> {
          for( int i = 1 ; i <= 10 ; i++ ) System.out.print( i + " " );
          System.out.println();
        };
        r.run();
        // 5.
        Comparator<Integer> comp1 = (o1,o2) -> o1-o2;
        list.sort(comp1);
        System.out.println(list);
        List<Employee> employeeDetails = Employee_data.getEmployeeDetails();
        // 6.
        Comparator<Employee> comp2 = (e1,e2) -> e1.getName().compareTo(e2.getName());
        employeeDetails.sort(comp2);
        System.out.println(employeeDetails);
        // 7.
        Comparator<Integer> comp3 = (o1,o2) -> o2-o1;
        Set<Integer> set1 = new TreeSet<>(comp3);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        System.out.println(set1);
        // 8.
        Set<Employee> set2 = new TreeSet<>(comp2);
        set2.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        set2.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        System.out.println(set2);
        // 9.
        Map<Integer,Integer> map1 = new TreeMap<>(comp3);
        map1.put(1,1);
        map1.put(2,4);
        map1.put(3,9);
        System.out.println(map1);
        // 10.
        Comparator<Employee> comp4 = (e1,e2) -> e2.getName().compareTo(e1.getName());
        Map<Employee,String> map2 = new TreeMap<>(comp4);
        map2.put(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0),"Ali Baig");
        map2.put(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0),"Amelia Zoe");
        System.out.println(map2);
        // 11.
        Collections.sort(employeeDetails);
        System.out.println(employeeDetails);
    }
}
