package com.day12.cal;

public class Div implements CalculatorInterface {
    @Override
    public void execute(int a, int b) {
        int div=0;
        div=a/b;
        System.out.println("div=\t"+div);
    }
}
