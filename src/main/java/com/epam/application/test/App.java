package com.epam.application.test;
import com.epam.application.test.Core_Java_Tasks.Task5;
import com.epam.application.test.Core_Java_Tasks.Task6;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Task5 t1 = new Task5("Sunday", 3);
        Task5 t2 = new Task5("Tuesday", 101);
        t1.startDayOfProject();
        t2.startDayOfProject();
        Task6 t3 = new Task6("Epam Systems Pvt Ltd");
        t3.findDuplicateChars();
    }
}
