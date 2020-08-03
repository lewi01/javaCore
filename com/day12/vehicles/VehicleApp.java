package com.day12.vehicles;

public class VehicleApp {
    public static void main(String[] args) {
        Ford ford=new Ford();
        ford.accelerate();
        ford.brake();

        System.out.println("============================================");
        Benz benz=new Benz();
        benz.accelerate();
        benz.brake();
    }
}
