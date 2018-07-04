package com.timbuchalka.array.challenge;

import javafx.scene.SnapshotParameters;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone  = new MobilePhone("0917 582 8964");

    public static void main(String[] args){

        // Create a program that implements a simple mobile phone with the following capabilities.
        // Able to store, modify, remove and query contact names
        // You will want to create a separate class for Contacts (name and phone number).
        // Create a master class (mobile phone) that holds the ArrayList of Contacts
        // The MobilePhone class has the functionality listed above.
        // Add a menu of options that are available.
        // Options: Quit, print, list of contacts, add new contact, update existing contact, remove contact
        // When adding or updating be sure to check if the contact already exists (use name)
        // Be sure not to expose the inner workings of the ArrayList to MobilePhone
        // e.g. no ints, no .get(i) etc
        // MobilePhone should do everything with Contact objects only.

        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("\nEnter action:");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("\nShutting down");
                    quit = true;
                    break;
                case 1:
                    printContact();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }

        }

    }

    private static void queryContact() {
        System.out.println("Enter existing contact name:");
        String name = scanner.nextLine();

        Contact existingContractRecord = mobilePhone.query(name);
        if (existingContractRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Contact name is " + existingContractRecord.getName() + ", contact number is " + existingContractRecord.getPhoneNumber());
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name:");
        String name = scanner.nextLine();

        Contact existingContractRecord = mobilePhone.query(name);
        if (existingContractRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter new contact name:");
        String newName = scanner.nextLine();
        System.out.println("Enter phone number");
        String newPhone = scanner.nextLine();

        Contact newContact= new Contact(newName,newPhone);

        if(mobilePhone.store(newContact)){
            System.out.println("Contact stored");
        }else {
            System.out.println("Error updating record");
        }
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name:");
        String name = scanner.nextLine();
        System.out.println("Enter phone number");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name,phone);
        if(mobilePhone.store(newContact)){
            System.out.println("Contact stored");
        }else {
            System.out.println("Contact is already on file");
        }
    }

    private static void startPhone(){
        System.out.println("Starting phone...");
    }

    private static void printActions(){
        System.out.println("\nAvailable actions: \npress");
        System.out.println("0 - to shutdown\n"
                        +  "1 -  to print contacts\n"
                        +  "2 -  to add new contact\n"
                        +  "3 -  to update an existing contact\n"
                        +  "4 -  to remove an existing contact\n"
                        +  "5 -  to query if an existing contact exist\n"
                        +  "6 -  to print a list of available actions\n");
    }

    public static void printContact(){
        mobilePhone.printContacts();
    }

    public static void removeContact(){
        System.out.println("Enter existing contact name:");
        String name = scanner.nextLine();

        Contact existingContractRecord = mobilePhone.query(name);
        if (existingContractRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        if(mobilePhone.remove(existingContractRecord)){
            System.out.println("Succesfully deleted record");
        }else {
            System.out.println("Error deleting record");
        }

    }


}
