package com.epam.application.test.SOLID_Tasks.Task5;

public class Task5 {
    public static void main(String[] args) {
        Card debitCard = new DebitCard();
        TicketBookingApp ticketApp1 = new TicketBookingApp(debitCard);
        ticketApp1.doPayment(4,5000);

        Card creditCard = new CreditCard();
        TicketBookingApp ticketApp2 = new TicketBookingApp(creditCard);
        ticketApp2.doPayment(4,5000);
    }
}
