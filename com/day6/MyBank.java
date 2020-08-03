package com.day6;

import java.util.Scanner;

public class MyBank {


    public static void main(String[] args) {
        int rPin = 1234;
        int checkBalance = 1000;
        int pin = 0;
        int deposit = 0;
        int option = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your pin");
        pin = scanner.nextInt();
//        if (pin != rPin)
//            System.out.println("incorrect pin");

        while(pin!=rPin){
            System.out.println("invalid pin");
            System.out.println("enter your valid pin");
            option=scanner.nextInt();
        }

        System.out.println("\tMENU\t");
        System.out.println(" 1- \tcheck balance");
        System.out.println("2- \tDeposit");
        option = scanner.nextInt();
        if (option == 1) {
            System.out.println("your balance is :\t" + checkBalance);
        }
        if (option == 2) {
            System.out.println("enter the amount");
            deposit = scanner.nextInt();
            checkBalance += deposit;
        }


    }
}