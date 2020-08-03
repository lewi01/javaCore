package com.day12.vehicles;

public class  Benz extends Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Benz accelerating");
    }

    @Override
    public void brake() {
        System.out.println("braking");
    }
}
