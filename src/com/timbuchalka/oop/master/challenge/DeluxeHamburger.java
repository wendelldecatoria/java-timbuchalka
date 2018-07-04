package com.timbuchalka.oop.master.challenge;

public class DeluxeHamburger extends Burger {

    public DeluxeHamburger(String name, String breadRollType, String meat, Integer burgerPrice) {
        super(name, breadRollType, meat, burgerPrice);
    }

    @Override
    public void addExtra(String name, int price){
        System.out.println("Not allowed to add extra");
    }
}


