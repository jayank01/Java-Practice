package com.epam.application.test.Core_Java_Tasks;

class Employee {
    int Id;
    String name;
    int salary;
    Address address;

    public Employee(int Id, String name, int salary, Address address) {
        this.Id = Id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public void printEmployeeDetails() {
        System.out.println("Employee ID: " + Id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Address: " + address.floorNumber + address.streetName + address.cityName + address.state + address.country );
    }
}

class Course{
    int Id;
    String name;
    int duration;

    public Course(int id, String name, int duration) {
        Id = id;
        this.name = name;
        this.duration = duration;
    }
}

class Registration{
    Employee e;
    Course c;

    public Registration(Employee e, Course c) {
        this.e = e;
        this.c = c;
    }
}

class Feedback{
    Employee e;
    Course c;
    String feedBack;

    public Feedback(Employee e, Course c, String feedBack) {
        this.e = e;
        this.c = c;
        this.feedBack = feedBack;
    }
}