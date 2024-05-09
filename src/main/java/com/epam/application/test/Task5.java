package com.epam.application.test;

public class Task5 {
    String day;
    int k;

    public Task5(String day, int k) {
        this.day = day;
        this.k = k;
    }

    public void startDayOfProject(){
        if( day.equals("Monday") ) k += 1;
        else if( day.equals("Tuesday") ) k += 2;
        else if( day.equals("Wednesday") ) k += 3;
        else if( day.equals("Thursday") ) k += 4;
        else if( day.equals("Friday") ) k += 5;
        else if( day.equals("Saturday") ) k += 6;
        else k += 7;
        k %= 7;
        if( k == 1 ) System.out.println("Monday");
        else if( k == 2 ) System.out.println("Tuesday");
        else if( k == 3 ) System.out.println("Wednesday");
        else if( k == 4 ) System.out.println("Thursday");
        else if( k == 5 ) System.out.println("Friday");
        else if( k == 6 ) System.out.println("Saturday");
        else System.out.println("Sunday");
    }
}

