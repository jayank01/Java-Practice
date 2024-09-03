package com.epam.basics.java8.java8.Design_Patterns.Builder_Pattern;

import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects() {
        this.subjects = List.of("Maths", "Physics", "Chemistry", "Computer Science");
        return this;
    }
}
