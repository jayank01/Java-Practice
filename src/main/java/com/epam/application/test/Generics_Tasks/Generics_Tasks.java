package com.epam.application.test.Generics_Tasks;

import java.util.*;

class GenericsBoundedType<T> {
    public static <T extends Comparable<T>> T max(T obj1, T obj2) {
        return (obj1.compareTo(obj2) >= 0) ? obj1 : obj2;
    }
}
public class Generics_Tasks {
    public static <T> int countElements(List<T> list) {
        int cnt = 0;
        for( T l : list ){
            cnt++;
        }
        return cnt;
    }
    public static <T> void exchangeElements(List<T> list) {
        int idx = list.size()-1;
        T temp = list.get(0);
        list.set(0, list.get(idx));
        list.set(idx, temp);
    }
    public static <T extends Number> int[] sumEvenOdd(List<T> list) {
        int oddSum = 0, evenSum = 0;
        for( T l : list ) {
            int val = l.intValue();
            if( val % 2 == 0 ) oddSum += val;
            else evenSum += val;
        }
        return new int[]{oddSum, evenSum};
    }
    public static <T> int firstOccurrence(List<T> list, T t) {
        int idx = -1;
        for( int i = 0 ; i < list.size() ; i++ ) {
            if( list.get(i).equals(t) ) return i;
        }
        return idx;
    }
    public static void main(String[] args) {
        // Task 1:
        Integer[] arr = {45,78,90,1,8,0,23};
        String[] str = {"Alice", "Bob", "Charlie"};
        List<Integer> list1 = new ArrayList<>(Arrays.asList(arr));
        List<String> list2 = new ArrayList<>(Arrays.asList(str));
        int c1 = countElements(list1);
        int c2 = countElements(list2);
        System.out.println(c1);
        System.out.println(c2);

        // Task 2:
        exchangeElements(list1);
        exchangeElements(list2);
        System.out.println(list1);
        System.out.println(list2);

        // Task 3:
        List<Integer> sums = new ArrayList<>(Arrays.asList(arr));
        int[] ans = sumEvenOdd(sums);
        System.out.println( "sum of odd ele: " + ans[0] );
        System.out.println( "sum of even ele: " + ans[1] );

        // Task 4:
        System.out.println(firstOccurrence(list1,90));
        System.out.println(firstOccurrence(list1,2));
        System.out.println(firstOccurrence(list2,"Bob"));

        // Task 5:
        System.out.println(GenericsBoundedType.max(10, 20));
        System.out.println(GenericsBoundedType.max("Alice", "Bob"));
    }
}
