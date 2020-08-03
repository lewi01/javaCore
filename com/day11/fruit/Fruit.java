package com.day11.fruit;

public class Fruit {
    private String name="";
    private  int weight=0;
    private String color="";
    private boolean isPerishable;

    public Fruit(String name, int weight, String color, boolean isPerishable) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.isPerishable = isPerishable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPerishable() {
        return isPerishable;
    }

    public void setPerishable(boolean perishable) {
        isPerishable = perishable;
    }
}
