package com.timbuchalka.oop.master.challenge;

public class Burger {

    // The basic hamburger should have the following items.
    // Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
    // the customer can select to be added to the burger.

    String name;
    String breadRollType; // whole wheat, italian
    String meat; // beef, pork , chicken

    Integer burgerPrice = 0;
    Integer burgerQuantity = 0;
    Integer extraQuantity = 0;
    Integer extraPrice = 0;
    Integer totalPrice = 0;
    Integer allowedExtras = 4;

    public Burger(String name, String breadRollType, String meat, Integer burgerPrice) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.burgerPrice = burgerPrice;
    }

    public void placeOrder(){
        System.out.println( "####################################################### \n" +
                this.burgerQuantity + " order(s) of Bill's " + this.name + "\n"
                + "Price: Php" + this.burgerPrice * this.burgerQuantity + "\n"
                + "Bread: " + this.breadRollType + "\n"
                + "Meat: " + this.meat);
    }

    public void addQuantity(Integer burgerQuantity){
        this.burgerQuantity += burgerQuantity;
    }

    public void addExtra(String name, int price){
        this.extraQuantity += 1;
        this.extraPrice += price;

        if(this.extraQuantity <= this.allowedExtras){
            System.out.println("Extra # " + this.extraQuantity + ": " + name + " - Php" + price);
        }else{
            System.out.println("Cannot Add more Extra");
        }
    }

    public void calculateTotalPrice(){
        this.totalPrice =  (burgerPrice +  this.extraPrice) * burgerQuantity;
        System.out.println("Total price is: " + totalPrice + "\n"
                            + "#######################################################");
    }

}
