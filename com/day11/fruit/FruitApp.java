package com.day11.fruit;

public class FruitApp {
    public static void main(String[] args) {

        System.out.println("==============================");
        OrangeFruit orangeFruit = new OrangeFruit("Orange", 1, "blue", true, "lemon");
        System.out.println("name\t"+orangeFruit.getName());
        System.out.println("color\t"+orangeFruit.getColor());
        System.out.println("weight\t"+orangeFruit.getWeight());
        System.out.println("Perishable\t"+orangeFruit.isPerishable());
        System.out.println("Type\t"+orangeFruit.getType());


        System.out.println("============================");
        BananaFruit b = new BananaFruit("Banana", 1, "yellow", true, "big",6);
        System.out.println("name\t"+b.getName());
        System.out.println("color\t"+b.getColor());
        System.out.println("weight\t"+b.getWeight());
        System.out.println("perishable\t"+b.isPerishable());
        System.out.println("width\t"+b.getType());
        System.out.println("width\t"+b.getLength());
    }
}
