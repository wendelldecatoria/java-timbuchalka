package com.timbuchalka.polymorphism;

public class Toyota extends Car {

    public Toyota(Integer cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "Toyota -> Start Engine";

    }

    @Override
    public String accelarate() {
        return "Toyota -> Accelerate";
    }

    @Override
    public String brake() {
        return "Toyota -> Stop Engine";
    }
}
