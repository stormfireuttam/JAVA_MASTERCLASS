package academy.learnprogramming;

import java.util.Scanner;

class Ticket {
    Scanner sc = new Scanner(System.in);
    int ticketNo;
    Flight flight;
    Passenger passenger;
    String cls, seat;
    Ticket(int tn, Flight f, Passenger p, String s, String c) {
        this.ticketNo = tn;
        this.flight = f;
        this.passenger = p;
        this.seat = s;
        this.cls = c;
    }

}
