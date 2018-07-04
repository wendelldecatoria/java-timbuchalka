package com.timbuchalka.autoboxing.and.unboxing;

public class Main {

    public static void main(String[] args){
        // You job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions

        Bank bank = new Bank("Bank Of the Philippine Islands");

        bank.addBranch("Vertis North");
        bank.addCustomer("Vertis North","Wendell Decatoria", 5000.50);
        bank.addCustomer("Vertis North","Juan Cruz", 3400.65);
        bank.addCustomer("Vertis North","Mary Lamb", 5400.38);

        bank.addBranch("Trinoma");
        bank.addCustomer("Trinoma", "Bamboo Manalac", 2500.54);
        bank.addCustomer("Trinoma", "John Rivermaya", 48000.98);
        bank.addCustomer("Trinoma", "Joey Gary", 7690.12);

        bank.listCustomer("Trinoma", false);

    }
}
