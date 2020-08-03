package com.day12.cal;

import java.util.Scanner;

public class CalculatorApp {
     private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        boolean quite=false;
        printAction();
        while(!quite){
            System.out.println( "enter your choice");
            int action=scanner.nextInt();
            switch (action){
                case 0:
                    System.out.println("exiting");
                    quite=true;
                    break;
                case 1:
                    add();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    multiply();
                    break;
                case 4:
                    div();
                    break;
            }
        }
        

    }
    private static  void printAction(){
        System.out.println("====MENU====");
        System.out.println("0-\t EXIT");
        System.out.println("1-\t ADD");
        System.out.println("2-\t MINUS");
        System.out.println("3-\t MULTIPLY");
        System.out.println("4-\t DIV");
    }
    private static void add(){
        System.out.println("Enter your value");
        int a=scanner.nextInt();
        System.out.println("Enter your value");
        int b=scanner.nextInt();
        Add add=new Add();
        add.execute(a,b);

    }
    private static void minus(){
        System.out.println("Enter your value");
        int a=scanner.nextInt();
        System.out.println("Enter your value");
        int b=scanner.nextInt();
        Minus add=new Minus();
        add.execute(a,b);

    }
    private static void multiply(){
        System.out.println("Enter your value");
        int a=scanner.nextInt();
        System.out.println("Enter your value");
        int b=scanner.nextInt();
        Multiply add=new Multiply();
        add.execute(a,b);

    }
    private static void div(){
        System.out.println("Enter your value");
        int a=scanner.nextInt();
        System.out.println("Enter your value");
        int b=scanner.nextInt();
        Div add=new Div();
            add.execute(a, b);

    }
}
