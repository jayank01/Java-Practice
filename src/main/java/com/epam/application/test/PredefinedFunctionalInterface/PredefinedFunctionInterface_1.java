package com.epam.application.test.PredefinedFunctionalInterface;

import java.util.List;
import java.util.function.*;

public class PredefinedFunctionInterface_1 {
    public static void main(String[] args) {
        // 1.
        List<Product> productList = Product_data.getProductDetails();
        Predicate<Integer> price = (value) -> value > 1000;
        for( Product product : productList ) {
            if( price.test(product.getPrice()) ) System.out.println( product );
        }
        // 2.
        Predicate<String> category = (cart) -> cart.equals("Electronics");
        for( Product product : productList ) {
            if( category.test(product.getCategory()) ) System.out.println( product );
        }
        // 3.
        Consumer<List<Product>> prgtr100 = (products) -> {
            for( Product p : products ) {
                if( p.getPrice() > 100 && p.getCategory().equals("Electronics")) System.out.println( p );
            }
        };
        prgtr100.accept(productList);
        // 4.
        Predicate<Product> prgtr100OrproELe = (p) -> {
            if(p.getPrice() > 100 || p.getCategory().equals("Electronics")) return true;
            return false;
        };
        for( Product p : productList) {
            if( prgtr100OrproELe.test(p) ) System.out.println( p );
        }
        // 5.
        Predicate<Product> prless100NproEle = (p) -> {
            if(p.getPrice() < 100 && p.getCategory().equals("Electronics")) return true;
            return false;
        };
        for( Product p : productList) {
            if( prless100NproEle.test(p) ) System.out.println( p );
        }

    }
}
