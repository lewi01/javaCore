package com.day12.cal;

public class Add implements CalculatorInterface {
    @Override
    public void execute(int a, int b) {
        int sum=0;
        sum=a+b;
        System.out.println("sum=\t"+sum);
    }
}
