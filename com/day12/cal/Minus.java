package com.day12.cal;

public class Minus implements CalculatorInterface {
    @Override
    public void execute(int a, int b) {
        int minus=0;
        minus=a-b;
        System.out.println("minus=\t"+minus);
    }
}
