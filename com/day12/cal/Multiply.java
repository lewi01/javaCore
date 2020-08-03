package com.day12.cal;

public class Multiply implements CalculatorInterface{
    @Override
    public void execute(int a, int b) {
        int multiply=0;
        multiply=a*b;
        System.out.println("multiply=\t"+multiply);
    }
}
