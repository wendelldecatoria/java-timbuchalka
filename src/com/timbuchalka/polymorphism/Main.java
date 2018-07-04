package com.timbuchalka.polymorphism;

public class Main {

    // create a bass class called car
    // it should have a few fields that would be appropriate for a generic car class
    // engine, cylinders, wheels, etc.
    // constructor should initialize cylinders (number of) and name, and set wheels to 4
    // and engine to true. Cylinders and names would be passed parameters
    //
    // create appropriate getters
    //
    // create some methods like startEngine, accelerate, and brake
    //
    // show a message for each in the base class
    // now create 3 sub classes for your favorite vehicles.
    // Override the appropriate methods to demonstrate polymorhphism in use.
    // Put all classes in the one java file.

    public static void main(String[] args){

        Car car = new Car(4, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelarate());
        System.out.println(car.brake());

        System.out.println("\n");

        Mitsubishi mitsubishi = new Mitsubishi(8, "Mitsubishi Mirage G4");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelarate());
        System.out.println(mitsubishi.brake());

        System.out.println("\n");

        Toyota toyota = new Toyota(4, "Toyota Vios");
        System.out.println(toyota.startEngine());
        System.out.println(toyota.accelarate());
        System.out.println(toyota.brake());


    }
}
