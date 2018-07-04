package com.timbuchalka.array.challenge;

import java.util.ArrayList;

public class MobilePhone {

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

    private String myNumber;
    private ArrayList<Contact> myContact;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContact = new ArrayList<Contact>();
    }

    public boolean store(Contact contact){
        System.out.println("mobilePhone.store()");
        if(findContact(contact.getName()) >= 0){
            myContact.add(contact);
            return true;
        }

        return false;
    }

    public Integer findContact(Contact contact){
        return myContact.indexOf(contact); // indexOf method returns the index # of the object or -1 if the object does not exist
    }

    private Integer findContact(String contactName){
        for(int i=0;i<= myContact.size(); i++){
            Contact contact = this.myContact.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public Boolean modify(Contact oldContact, Contact newContact){
        if(findContact(oldContact.getName()) >= 0){
            myContact.add(findContact(oldContact.getName()), newContact);
            return true;
        }
            return false;

    }

    public Boolean remove(Contact contact){
        if(findContact(contact.getName()) >= 0){
            myContact.remove(findContact(contact.getName()));
           return true;
        }else{
           return false;
        }
    }

    public String query(Contact contact){
        if(findContact(contact) >= 0){
            return contact.getName();
        }

        return null;
    }

    public Contact query(String name){
        int position = findContact(name);
        if(position >= 0){
            return myContact.get(position);
        }

        return null;
    }


    public void printContacts() {
        System.out.println("Contact List");
        System.out.println(myContact.size());
        for(int i=0;i< myContact.size(); i++) {
            System.out.println((i+1) + ". "
                              + this.myContact.get(i).getName() + " -> "
                              + this.myContact.get(i).getPhoneNumber()
            );
        }
    }

}
