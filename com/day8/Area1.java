package com.day8;

import java.util.Scanner;

public class Area1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=0;
        int b=0;
        int c=0;
        System.out.println("Enter value a");
        a=scanner.nextInt();
        System.out.println("Enter value b");
        b=scanner.nextInt();
        System.out.println("Enter value c");
        c=scanner.nextInt();
        System.out.println("product1\t"+result(a,b));
        System.out.println("product2\t"+result(a,b,c));
    }
    static int result(int a, int b){
        return a*b;
    }
    static int result(int a, int b ,int c){
        return a*b*c;
    }
}
