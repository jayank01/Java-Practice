package com.epam.basics.java8.java8.Design_Patterns.Builder_Pattern;

import java.util.List;

public class Student {
    int rollNumber;
    String name;
    int age;
    String fatherName;
    String motherName;
    List<String> subjects;

    public Student(StudentBuilder studentBuilder) {
        this.rollNumber = studentBuilder.rollNumber;
        this.name = studentBuilder.name;
        this.age = studentBuilder.age;
        this.fatherName = studentBuilder.fatherName;
        this.motherName = studentBuilder.motherName;
        this.subjects = studentBuilder.subjects;
    }

    public String toString(){
        return "roll number: " + this.rollNumber +
                ", name: " + this.name +
                ", age: " + this.age +
                ", father name: " + this.fatherName +
                ", mother name: " + this.motherName +
                ", subjects: " + this.subjects;
    }
}
