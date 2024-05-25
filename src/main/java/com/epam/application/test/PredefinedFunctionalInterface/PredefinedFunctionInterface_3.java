package com.epam.application.test.PredefinedFunctionalInterface;

import java.util.List;
import java.util.function.*;

public class PredefinedFunctionInterface_3 {
    public static void main(String[] args) {
        // 1.
        List<Product> productList = Product_data.getProductDetails();
        Function<List<Product>,Integer> costOfProducts1 = (products) -> {
            int cost = 0;
            for( Product p : products ) {
                cost += p.getPrice();
            }
            return cost;
        };
        System.out.println(costOfProducts1.apply(productList));
        // 2.
        Function<List<Product>,Integer> costOfProducts2 = (products) -> {
            int cost = 0;
            for( Product p : products ) {
                if( p.getPrice() > 1000 ) cost += p.getPrice();
            }
            return cost;
        };
        System.out.println(costOfProducts2.apply(productList));
        // 3.
        Function<List<Product>,Integer> costOfProducts3 = (products) -> {
            int cost = 0;
            for( Product p : products ) {
                if( p.getCategory().equals("Electronics") ) cost += p.getPrice();
            }
            return cost;
        };
        System.out.println(costOfProducts3.apply(productList));
        // 4.
        Function<List<Product>,Integer> costOfProducts4 = (products) -> {
            int cost = 0;
            for( Product p : products ) {
                if( p.getPrice() > 1000 && p.getCategory().equals("Electronics") ) cost += p.getPrice();
            }
            return cost;
        };
        System.out.println(costOfProducts4.apply(productList));

    }
}
