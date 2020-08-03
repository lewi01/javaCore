package com.day11.vehicle;

public class Vehicle {
    protected String name="";
    protected String regNo="";
    protected String color="";
    public void stop() {
        System.out.println("vehicle stopping");
    }
    public void brake() {
        System.out.println("vehicle braking");
    }
    public void accelerate() {
        System.out.println("vehicle accelerating");
    }
}
