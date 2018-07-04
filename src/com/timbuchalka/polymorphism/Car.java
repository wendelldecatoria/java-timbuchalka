package com.timbuchalka.polymorphism;

public class Car {

    Boolean engine; // true, false
    String color;
    String type; // sedan, hatchback, suv,
    String name; // honda, mitsubishi, ford, toyota, hyundai, suzuki,
    Integer cylinder;
    Integer wheels;

    public Car(Integer cylinder, String name) {
        this.engine = true;
        this.name = name;
        this.cylinder = cylinder;
        this.wheels = 4;
    }

    public String startEngine(){
//        this.engine  = true;
        return "Car -> Start Engine";
    }

    public String stopEngine(){
//        this.engine = false;
        return "Car -> Stopped Engine";
    }

    public String accelarate(){
        return "Car -> Accelerate";
    }

    public String brake(){
        return "Car -> Brake";
    }

    public Integer getCylinder() {
        return cylinder;
    }

    public void setCylinder(Integer cylinder) {
        this.cylinder = cylinder;
    }

    public Boolean getEngine() {
        return engine;
    }

    public void setEngine(Boolean engine) {
        this.engine = engine;
    }

    public Integer getWheels() {
        return wheels;
    }

    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String manufacturer) {
        this.name = manufacturer;
    }
}
