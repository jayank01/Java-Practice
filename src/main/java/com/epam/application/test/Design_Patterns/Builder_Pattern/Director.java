package com.epam.basics.java8.java8.Design_Patterns.Builder_Pattern;

public class Director {
    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if( studentBuilder instanceof EngineeringStudentBuilder ) return createEngineeringStudent();
        else return createMBAStudent();
    }

    public Student createEngineeringStudent() {
        return studentBuilder
                .setRollNumber(1)
                .setName("John")
                .setAge(20)
                .setFatherName("Robert")
                .setMotherName("Mary")
                .setSubjects()
                .build();
    }

    public Student createMBAStudent() {
        return studentBuilder
                .setRollNumber(2)
                .setName("Jane")
                .setAge(22)
                .setFatherName("David")
                .setMotherName("Sophia")
                .setSubjects()
                .build();
    }
}
