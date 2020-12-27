package academy.learnprogramming;

import java.util.ArrayList;

public class MobilePhones {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhones(String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int findPosition = findContact(oldContact);
        if(findPosition < 0) {
            System.out.println(oldContact.getName() + ", was not found");
            return false;
        } else if(findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name : " + newContact.getName() + " already exists. Update was not successful");
        }
        this.myContacts.set(findPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }
    public boolean removeContact(Contact contact) {
        int findPosition = findContact(contact);
        if(findPosition < 0) {
            System.out.println(contact.getName() + ", was not found");
            return false;
        }
        this.myContacts.remove(findPosition);
        System.out.println(contact.getName() + ", was deleted");
        return true;
    }

    public String queryContact(Contact contact) {
        if(findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if(position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }
    private int findContact(String contactName) {
        for(int i = 0; i < this.myContacts.size(); i ++) {
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)) {
                return 1;
            }
        }
        return -1;
    }

    public void printContacts() {
        System.out.println("Contact list\n");
        for(int i = 0; i < this.myContacts.size(); i ++) {
            System.out.println((i+1) + "." + this.myContacts.get(i).getName() + " -> "
                    + this.myContacts.get(i).getPhoneNumber());
        }

    }
}
