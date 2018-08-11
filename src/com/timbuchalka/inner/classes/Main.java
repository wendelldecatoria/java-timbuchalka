package com.timbuchalka.inner.classes;

public class Main {
    public static void main(String[] args){
        GearBox mcLaren = new GearBox(6);
        GearBox.Gear first = mcLaren.new Gear(1, 12.3);
        System.out.println(first.driveSpeed(1000));
    }
}
