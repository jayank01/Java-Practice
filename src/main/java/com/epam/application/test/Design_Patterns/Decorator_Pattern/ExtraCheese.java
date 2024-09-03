package com.epam.basics.java8.java8.Design_Patterns.Decorator_Pattern;

import com.epam.basics.java8.java8.Design_Patterns.Decorator_Pattern.pizza.BasePizza;

public class ExtraCheese extends ToppingDecorator {

    private final BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 10;
    }
}
