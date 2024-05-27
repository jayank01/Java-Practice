package com.epam.application.test.SOLID_Tasks.Task3;

public class SmartPhone extends Phone{
    @Override
    public void playMusic(String fileName) {
        System.out.println("Playing music "+fileName);
    }

    @Override
    public void playVideo(String videoFileName) {
        System.out.println("Playing video "+videoFileName);
    }

    @Override
    public void call() {
        System.out.println("calling");
    }

    @Override
    public void sendSMS() {
        System.out.println("sending sms..");
    }
}
