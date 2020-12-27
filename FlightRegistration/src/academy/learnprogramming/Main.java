package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
     Scanner sc = new Scanner(System.in);
     FlightRegistrationSystem system = new FlightRegistrationSystem();
     int choice;
     do{
         printMenu();
         System.out.print("Your choice: ");
         choice = sc.nextInt();
         sc.nextLine();
         system.registrationSystem(choice);
     }while(choice != 7);
    }

    static void  printMenu() {
        System.out.println("(1)Add a new flight.\n" +
                "(2) Buy Ticket.\n" +
                "(3) Request a Check-In.\n" +
                "(4) Process a Check-In.\n" +
                "(5) Display Valid Check-Ins.\n" +
                "(6) Calculate Take-Off Load.\n" +
                "(7) Exit.");
    }
}
