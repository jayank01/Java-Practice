package com.epam.application.test.PredefinedFunctionalInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class Bi_Function {
    public static void main(String[] args) {
        List<Product> productList = Product_data.getProductDetails();
        // 1.
        BiFunction<String,Integer,Product> createProduct = (name, price) -> new Product(name, price, "Electronics", 9);
        productList.add(createProduct.apply("Mouse",100));
        System.out.println(productList);
        // 2.
        BiFunction<Product,Integer,Integer> costOfCart = (product, quantity) -> quantity*product.getPrice();
        Map<Product,Integer> cart = new HashMap<>();
        cart.put(productList.get(0), 2);
        cart.put(productList.get(2), 3);
        cart.put(productList.get(3), 1);
        int cost = 0;
        for( Product p : cart.keySet() ) {
            cost += costOfCart.apply(p,cart.get(p));
        }
        System.out.println("Cost of cart is " + cost );
    }
}
