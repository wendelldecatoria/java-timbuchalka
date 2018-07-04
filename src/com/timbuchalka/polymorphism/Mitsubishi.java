package com.timbuchalka.polymorphism;

public class Mitsubishi extends Car {

    public Mitsubishi(Integer cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> Start Engine";
    }

    @Override
    public String accelarate() {
        return "Mitsubishi -> Accelerate";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> Brake";
    }
}
