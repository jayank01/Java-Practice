package com.epam.application.test.SOLID_Tasks.Task4;

public class ABC_UPI_App implements UPIPayments {
    @Override
    public void payMoney(){
        System.out.println("Money send to user");
    }

    @Override
    public void getScratchCard() {
        System.out.println("Scratch card Generated");
    }

}
