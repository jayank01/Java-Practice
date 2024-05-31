package com.epam.application.test.SOLID_Tasks.Task2;

import java.util.ArrayList;
import java.util.List;

public class NotificationService{
    List<Notification> notificationList = new ArrayList<>();

    public void add(Notification notification) {
        notificationList.add(notification);
    }

    public void notify(String medium) {
        for( Notification notification : notificationList ) {
            notification.sendOTP(medium);
        }
    }
}
