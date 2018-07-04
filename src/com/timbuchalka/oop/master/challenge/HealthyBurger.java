package com.timbuchalka.oop.master.challenge;

public class HealthyBurger extends Burger {

    // a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
    // The healthy burger can have 6 items (Additions) in total.
    // hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
    // not the base class (Hamburger), since the two additions are only appropriate for this new class
    // (in other words new burger type).

    Integer allowedExtras = 6;

    public HealthyBurger(String name, String meat, Integer burgerPrice) {
        super(name, "brown rye bread roll", meat, burgerPrice);

    }

    @Override
    public void addExtra(String name, int price){
        this.extraQuantity += 1;
        this.extraPrice += price;

        if(this.extraQuantity <= this.allowedExtras){
            System.out.println("Extra # " + this.extraQuantity + ": " + name + " - Php" + price);
        }else{
            System.out.println("Cannot Add more Extra");
        }
    }
}
