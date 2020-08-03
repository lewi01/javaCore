package com.day8;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        double radius=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your radius");
        radius=scanner.nextInt();
        double area=getArea(radius);
        System.out.println("your area is" +getArea(radius));
        double cur=getC(radius);
        System.out.println("Your circumference is"+ getC(radius));

    }
    static  double getArea( double radius){
        double area = radius*radius*Math.PI;
        return area;
    }
     static double getC( double radius){
        double cur = 2*radius*Math.PI;
        return cur;
    }
}
