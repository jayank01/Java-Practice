package com.epam.application.test.PredefinedFunctionalInterface;

import java.util.List;
import java.util.function.*;

public class PredefinedFunctionInterface_2 {
    public static void main(String[] args) {
        List<Product> productList = Product_data.getProductDetails();
        // Consumer
        // 1.
        Consumer<List<Product>> printProduct = (products) -> {
            for( Product product : products ) {
                System.out.println( product );
            }
        };
        printProduct.accept(productList);
        // 2.
        Consumer<List<Product>> premiumProduct = (products) -> {
          for( Product p : products ) {
              if( p.getPrice() > 1000 ) {
                  p.setGrade(10);
              }
          }
        };
        premiumProduct.accept(productList);
        // 3.
        Consumer<List<Product>> suffix = (products) -> {
            for( Product p : products ) {
                if( p.getPrice() > 3000 ) {
                    String updName = p.getName() + "*";
                    p.setName(updName);
                }
            }
        };
        suffix.accept(productList);
        // 4.
        Consumer<List<Product>> printPremium = (products) -> {
            for( Product p : products ) {
                int idx = p.getName().length()-1;
                if( p.getName().charAt(idx) == '*' && p.getGrade() == 10 ) System.out.println( p );
            }
        };
        printPremium.accept(productList);
        // supplier
        // 1.
        Supplier<Product> addProduct = () -> new Product("HDMI Cable", 200, "Electronics", 8);
        productList.add(addProduct.get());
        // 2.
        Supplier<Integer> randomOTP = () -> (int)(Math.random()*10000);
        System.out.println("OTP is " + randomOTP.get());
    }
}
