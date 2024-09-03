package com.epam.basics.java8.java8.Design_Patterns.Builder_Pattern;

import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects() {
        this.subjects = List.of("Marketing", "Finance", "Human Resource", "Operations");
        return this;
    }
}
