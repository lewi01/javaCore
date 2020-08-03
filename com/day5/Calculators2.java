package com.day5;

import java.util.Scanner;

public class Calculators2 {
    public static void main(String[] args) {
        int a=12;
        int b=10;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        a=scanner.nextInt();
        System.out.println("Enter a number");
        b=scanner.nextInt();
        int sum=0;
        int subtraction=0;
        int multiplication=0;
        int division=0;
        int modulus=0;
        sum=a+b;
        subtraction =a-b;
        multiplication= a*b;
        modulus=a%b;
        division=a/b;
        System.out.println("the sum is+"+ " "+sum +"\n"
                + "the sum is+"+ " "+subtraction +"\n"
                +"the sum is+"+ " "+multiplication+"\n"
                +"the sum is+"+ " "+modulus+"\n"
                +"the sum is+"+ " "+division);


    }
}
