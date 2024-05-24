package com.epam.application.test;
import com.epam.application.test.Core_Java_Tasks.*;
import com.epam.application.test.Classes_And_Objects_Tasks.*;

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
        Book b1 = new Book(1, "Anna Karenina", "Leo Tolstoy");
        Book b2;
        b2 = new Book();
        b2.setBookId(2);
        b2.setBookName("Madame Bovary");
        b2.setAuthorName("Gustave Flaubert");
        Book b3 = new Book(3, "War and Peace", "Leo Tolstoy");
        Book b4 = new Book(4, "The Great Gatsby", "F. Scott Fitzgerald");
        Book b5 = new Book(5, "Lolita", "Vladimir Nabokov");
        Book b6 = new Book(6, "Middlemarch", "George Eliot");
        Book b7 = new Book(7, "Don Quixote", "Miguel de Cervantes");
        Book b8 = new Book(8, "Moby Dick", "Herman Melville");
        Book b9 = new Book( 9, "Hamlet", "William Shakespeare");
        Book b10 = new Book(10, "Ulysses", "James Joyce");
        Book[] Books = {b1, b2, b3, b4, b5, b6, b7, b8, b9, b10 };
        for( Book b : Books) {
            System.out.println( b.getBookId() + " " + b.getBookName() + " " + b.getAuthorName() );
        }
        Employee E1 = new Employee( "Robert", 1994, "64C- WallsStreat" );
        Employee E2 = new Employee( "Sam", 2000, "68D- WallsStreat" );
        Employee E3 = new Employee( "John", 1999, "26B- WallsStreat" );
        Employee[] E = new Employee[3];
        E[0] = E1;
        E[1] = E2;
        E[2] = E3;
        Employee emp = new Employee();
        emp.printInfo( E );
        Movie m1 = new Movie("Dunki", "Raj Kumar Hirani", 2024, "Comedy, Drama", 6.6);
        m1.AddReview(7.3);
        m1.getMovieDetails();
        UserNameValidator unv = new UserNameValidator();
        boolean f = unv.Validate("123456");
        if( f ) System.out.println("Username is valid");
        Task5_ObjNClasses obj = new Task5_ObjNClasses();
        obj.fun("I have a lot of tasks that complete today, so I need that stay focused.", "that", "to");
    }
}
