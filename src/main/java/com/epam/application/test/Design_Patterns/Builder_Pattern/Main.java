package com.epam.basics.java8.java8.Design_Patterns.Builder_Pattern;

public class Main {
    public static void main(String[] args) {
        Director director1 = new Director(new EngineeringStudentBuilder());
        Director director2 = new Director(new MBAStudentBuilder());

        Student student1 = director1.createStudent();
        Student student2 = director2.createStudent();

        System.out.println(student1.toString());
        System.out.println(student2.toString());
    }
}
