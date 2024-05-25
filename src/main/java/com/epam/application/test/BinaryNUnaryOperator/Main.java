package com.epam.application.test.BinaryNUnaryOperator;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // 1.
        Predicate<Integer> isPrimeNum = (n) -> {
            if( n < 4 ) return true;
            for( int i = 2 ; i <= Math.sqrt(n) ; i++ ) {
                if( n%i == 0 ) return false;
            }
            return true;
        };
        System.out.println(isPrimeNum.test(99));
        System.out.println(isPrimeNum.test(21));
        // 2.
        Consumer<Integer> sqrNum = (n) -> System.out.println(n*n);
        sqrNum.accept(5);
        sqrNum.accept(7);
        // 3.
        Supplier<Integer> numBelow500 = () -> (int)(Math.random()*5000);
        System.out.println(numBelow500.get());
        System.out.println(numBelow500.get());
    }
}
