package academy.learnprogramming;


import java.util.Scanner;

class Passenger {
    Scanner sc = new Scanner(System.in);
    String name, surname;
    Passenger() {
        this.name = "";
        this.surname = "";
    }
    Passenger(String n, String sn) {
        this.name = n;
        this.surname = sn;
    }
    Passenger addPassenger() {
        System.out.print("Your Name: ");
        name = sc.nextLine();
        System.out.print("\nYour Surname: ");
        surname = sc.nextLine();
        Passenger p = new Passenger(name, surname);
        return p;
    }
}