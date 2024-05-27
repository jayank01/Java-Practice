package com.epam.application.test.SOLID_Tasks.Task4;

public class GooglePay implements CashbackUPIPayments{
    @Override
    public void getScratchCard() {
        System.out.println("Money send to user");
    }

    @Override
    public void payMoney() {
        System.out.println("Scratch card Generated");
    }

    @Override
    public void getCashBackAsCreditBalance() {
        System.out.println("Cash back given as Credit Balance");
    }
}
