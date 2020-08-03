package com.day12.vehicles;

public class Ford extends Vehicle {

    @Override
    public void accelerate() {
        System.out.println("ford vehicle accelerating");
    }

    @Override
    public void brake() {
        System.out.println("ford braking");;
    }
}
