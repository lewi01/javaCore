package com.day11.vehicle;

public class VehicleApp {
    public static void main(String[] args) {
        Ford ford=new Ford();
        ford.color="white";
        ford.name="ford x";
        ford.regNo="kab 123k";
        ford.setWheels(4);
        ford.stop();
        ford.brake();
        System.out.println("ford name"+ford.name);
        System.out.println("ford color"+ford.color);
        System.out.println("ford regNo"+ford.regNo);
        System.out.println("ford name"+ford.getWheels());

        Toyota toyota=new Toyota();
        toyota.name="corolla";
        toyota.regNo="kax 324s";
        toyota.color="black";
        toyota.accelerate();
        toyota.brake();
        System.out.println("Toyota name"+toyota.name);
        System.out.println("fToyota name"+toyota.color);
        System.out.println("fToyota name"+toyota.regNo);
        //System.out.println("fToyota name"+toyota.regNo);
    }
}
