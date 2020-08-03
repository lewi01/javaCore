package com.day11.fruit;
public class OrangeFruit extends Fruit {
    private  String type="";

    public OrangeFruit(String name, int weight, String color, boolean isPerishable, String type) {
        super(name, weight, color, isPerishable);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
