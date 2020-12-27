package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class FlightRegistrationSystem {
    Scanner sc = new Scanner(System.in);

    ArrayList<Flight> flights = new ArrayList<Flight>();
    ArrayList<Ticket> tickets = new ArrayList<Ticket>();
    int ticketNo = 1,flightNo, maxLoad, year, month, day, hour, min;
    Flight f;
    DateTime t, t1, t2;
    Passenger p ;
    String origin, destination;

    void registrationSystem(int choice) {
        switch (choice) {
            case 1:
                flights.add(f.addFlight());
                System.out.println();
                break;
            case 2:
                addTicket();
                System.out.println();
                break;
            case 3:


        }
    }

    Flight identifyFlight(int flightNo){
        for (int i = 0; i < flights.size(); i ++){
            if(flights.get(i).getFlightNo() == flightNo ){
                return flights.get(i);
            }
        }
        return null;
    }

    public void  addTicket() {
        Passenger p1 = new Passenger();
        String seat, cls;
        System.out.print("Enter the flight No: ");
        int flightNumber = sc.nextInt();
        System.out.println("Enter your Passenger Information;");
        p = p1.addPassenger();
        System.out.print("\nEnter your Seat number: ");
        seat = sc.nextLine();
        System.out.print("\nEnter your Class: ");
        cls = sc.nextLine();
        if(identifyFlight(flightNumber) != null){
            Flight flight = identifyFlight(flightNumber);
            Ticket t = new Ticket(ticketNo, flight, p, seat, cls);
            tickets.add(t);
        }
    }



}
