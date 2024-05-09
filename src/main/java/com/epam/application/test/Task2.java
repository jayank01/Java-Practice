package com.epam.application.test;

class JuniorEngineer extends Employee {
    int assessmentScore;
    String feedBack;

    public JuniorEngineer(int Id, String name, int salary, Address address, int assessmentScore, String feedBack) {
        super(Id, name, salary, address);
        this.assessmentScore = assessmentScore;
        this.feedBack = feedBack;
    }

}

class SoftwareEngineer extends Employee {
    String projectName;

    public SoftwareEngineer(int Id, String name, int salary, Address address, String projectName) {
        super(Id, name, salary, address);
        this.projectName = projectName;
    }
    @Override
    public void printEmployeeDetails(){
        System.out.println("Details of Software Engineer");
        System.out.println("Project Name: " + projectName );
    }
}

class Trainer extends Employee {
    String skills;
    String certifications;

    public Trainer(int Id, String name, int salary, Address address, String skills, String certifications) {
        super(Id, name, salary, address);
        this.skills = skills;
        this.certifications = certifications;
    }
    @Override
    public void printEmployeeDetails(){
        System.out.println("Details of Trainee");
        System.out.println("Skills: " + skills);
        System.out.println("Certifications: " + certifications);
    }
}