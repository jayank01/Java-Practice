package com.epam.application.test.SOLID_Tasks.Task5;

public class TicketBookingApp {
    private Card card;

    public TicketBookingApp( Card card ) {
        this.card = card;
    }
    public void doPayment(int noOfTickets, int amount) {
        card.doTransaction(amount);
    }
}
