package academy.learnprogramming;
import java.util.Scanner;

class Flight {
    Scanner sc = new Scanner(System.in);
    int flightNo, maxLoadOfPlane;
    DateTime departureTime, arrivalTime;
    String originCity, destinationCity;

    Flight(int fn, DateTime dt, DateTime at, String oc, String dc, int ml) {
        this.flightNo = fn;
        this.departureTime = dt;
        this.arrivalTime = at;
        this.originCity = oc;
        this.destinationCity = dc;
        this.maxLoadOfPlane = ml;
    }

    public int getFlightNo() {
        return flightNo;
    }

    Flight addFlight(){
        DateTime t = new DateTime();
        System.out.print("Enter the flight no: ");
        flightNo = sc.nextInt();
        System.out.println("\nEnter the departure Time;");
        departureTime = t.getTime();
        System.out.println("\nEnter the Arrival Time;");
        arrivalTime = t.getTime();
        System.out.print("\nEnter the Origin City: ");
        originCity = sc.nextLine();
        System.out.print("\nEnter the Destination City: ");
        destinationCity = sc.nextLine();
        System.out.print("\nEnter the Max Load: ");
        maxLoadOfPlane = sc.nextInt();
        Flight f = new Flight(flightNo, departureTime, arrivalTime, originCity, destinationCity, maxLoadOfPlane);
        return f;
    }
}