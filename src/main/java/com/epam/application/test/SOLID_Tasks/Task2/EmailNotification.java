package com.epam.application.test.SOLID_Tasks.Task2;

public class EmailNotification implements Notification{
    @Override
    public void sendOTP(String medium) {
        if(medium.equals("email")) {
            // write email related logic
        }
    }
}
