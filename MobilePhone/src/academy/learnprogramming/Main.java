package academy.learnprogramming;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static MobilePhones mobilePhones = new MobilePhones("8126040025");
    public static void main(String[] args) {
	// write your code here
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = sc.nextInt();
            sc.nextLine();
            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhones.printContacts();
                    break;
                case 2:
                    System.out.println("Enter new Contact name :\n");
                    String name = sc.nextLine();
                    System.out.println("Enter phone Number : \n");
                    String phone = sc.nextLine();
                    Contact newContact = Contact.createContact(name, phone);
                    if(mobilePhones.addNewContact(newContact)){
                        System.out.println("New contact added: Name - " + name + ", phone - " + phone);
                    } else {
                        System.out.println("Cannot add, " + name + "already on file");
                    }
                    break;
                case 3:
                    updateRecord();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    query();
                    break;
                case 6:
                    printActions();
            }
        }
    }

    private static void startPhone() {
        System.out.println("Starting the phone .....");
    }
    private static void query() {
        System.out.println("Enter existing contact name : ");
        String oldName = sc.nextLine();
        Contact existingContactRecord = mobilePhones.queryContact(oldName);
        if(existingContactRecord == null) {
            System.out.println("Contact not found!!");
            return;
        }
        System.out.println("Name : " + existingContactRecord.getName() + " -> Phone number :  " + existingContactRecord.getPhoneNumber());
        mobilePhones.queryContact(existingContactRecord);
    }
    private static void removeContact() {
        System.out.println("Enter existing contact name : ");
        String oldName = sc.nextLine();
        Contact existingContactRecord = mobilePhones.queryContact(oldName);
        if(existingContactRecord == null) {
            System.out.println("Contact not found!!");
            return;
        }
        if(mobilePhones.removeContact(existingContactRecord)) {
            System.out.println("Contact successfully removed");
        } else {
            System.out.println("Error while deleting record");
        }
    }
    private static void updateRecord() {
        System.out.println("Enter existing contact name : ");
        String oldName = sc.nextLine();
        Contact existingContactRecord = mobilePhones.queryContact(oldName);
        if(existingContactRecord == null) {
            System.out.println("Contact not found!!");
            return;
        }
        System.out.println("Enter new Contact name :\n");
        String newName = sc.nextLine();
        System.out.println("Enter phone Number : \n");
        String newPhone = sc.nextLine();
        Contact newContactRecord = Contact.createContact(newName, newPhone);
        if(mobilePhones.updateContact(existingContactRecord, newContactRecord)) {
            System.out.println("Successfully updated Record");
        }   else {
            System.out.println("Error updating record");
        }
    }
    private static void printActions(){
        System.out.println("\nAvailable Actions : Press");
        System.out.println("0 - to shutdown \n");
        System.out.println("1 - to print Contacts \n" +
                "2 - to add a new Contact\n" +
                "3 - to update an existing contact\n" +
                "4 - to remove an existing contact\n" +
                "5 - query if an existing contact exists\n"+
                "6 - to print a list of all available actions\n");
        System.out.println("Choose your action\n");


    }
}
