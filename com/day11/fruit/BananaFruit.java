package com.day11.fruit;

public class BananaFruit extends OrangeFruit {
    private  int length=0;

    public BananaFruit(String name, int weight, String color, boolean isPerishable, String type, int length) {
        super(name, weight, color, isPerishable, type);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
