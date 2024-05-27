package com.epam.application.test.SOLID_Tasks.Task5;

public class CreditCard implements Card {
    @Override
    public void doTransaction(int amount) {
        System.out.println("tx done with CreditCard");
    }
}
