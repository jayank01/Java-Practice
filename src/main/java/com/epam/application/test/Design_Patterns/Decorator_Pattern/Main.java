package com.epam.basics.java8.java8.Design_Patterns.Decorator_Pattern;

import com.epam.basics.java8.java8.Design_Patterns.Decorator_Pattern.pizza.BasePizza;
import com.epam.basics.java8.java8.Design_Patterns.Decorator_Pattern.pizza.Farmhouse;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new Farmhouse();
        System.out.println(pizza.cost());
        pizza = new Mushroom(new ExtraCheese(pizza));
        System.out.println(pizza.cost());
    }
}
