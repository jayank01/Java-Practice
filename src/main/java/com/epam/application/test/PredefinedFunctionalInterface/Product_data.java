package com.epam.application.test.PredefinedFunctionalInterface;

import java.util.ArrayList;
import java.util.List;

public class Product_data {
    public static List<Product> getProductDetails() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Laptop", 1200, "Electronics", 1));
        productList.add(new Product("Smartphone", 800, "Electronics", 2));
        productList.add(new Product("Tablet", 400, "Electronics", 3));
        productList.add(new Product("Headphones", 150, "Electronics", 4));
        productList.add(new Product("Smartwatch", 200, "Electronics", 5));
        productList.add(new Product("Earphones", 50, "Electronics", 6));
        productList.add(new Product("Television", 3100, "Electronics", 7));
        return productList;
    }
}
