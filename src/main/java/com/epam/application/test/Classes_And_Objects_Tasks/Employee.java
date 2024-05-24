package com.epam.application.test.Classes_And_Objects_Tasks;

public class Employee{
    String name;
    int Year_of_Joining;
    String Address;

    public Employee(){
    }

    public Employee(String name, int Year_of_Joining, String Address) {
        this.name = name;
        this.Year_of_Joining = Year_of_Joining;
        this.Address = Address;
    }

    public void printInfo( Employee[] emp ) {
        System.out.println( "Name   Year of Joining   Address" );
        // for( int i = 0 ; i < emp.length ; i++ ) {
        //     System.out.println( emp[i].name + "   " + emp[i].Year_of_Joining + "   " + emp[i].Address );
        // }
        for( Employee e : emp ) {
            System.out.println( e.name + "   " + e.Year_of_Joining + "   " + e.Address );
        }
    }
}
