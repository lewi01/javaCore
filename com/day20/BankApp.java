package com.day20;

import java.util.HashMap;
import java.util.Scanner;

public class BankApp {
    private static Scanner scanner = new Scanner(System.in);
    private static Customer customer = new Customer();

    public static void main(String args[]) {
        MobileNumber mobileNumber = new MobileNumber(12345);
        Customer customer = new Customer("lewis", "Mombasa", mobileNumber, 1234);
        HashMap<MobileNumber, Account> accountHashMap = new HashMap<>();
        accountHashMap.put(mobileNumber, new Account(AccountType.SAVINGS, NationalID.NATIONALID,
                1000));
        System.out.println("Enter your pin");
        int pin = scanner.nextInt();

        if (pin != customer.getPin()) {
            System.out.println("invalid pin");
        } else {
            System.out.println("enter your number");
            int number = scanner.nextInt();
            if (number != mobileNumber.getMobileNumber()) {
                System.out.println("invalid number");
            } else {
                boolean quite = false;
                displayMenu();
                while (!quite) {
                    System.out.println("Enter your choice");
                    int action = scanner.nextInt();
                    switch (action) {
                        case 0:
                            System.out.println("Exiting");
                            quite = true;
                            break;
                        case 1:
                            existingCustomer();
                            break;
                    }

                }
            }
        }

    }

    public static void displayMenu() {
        System.out.println("=====MENU=====");
        System.out.println("0-\t Exit \n" +
                "1-\t Existing customer \n");
    }

    public static void existingCustomer() {
        double deposit = 0;
        double withdraw = 0;
        boolean option = false;
        while (!option) {
            Account account = new Account();
            System.out.println("Would you like to:\n" +
                    "0-\t Return to Main Menu\n" +
                    "1-\t Deposit\n" +
                    "2-\t Withdraw\n" +
                    "3-\t Check Balance\n" +
                    "4-\t Customer Transaction\n");

            System.out.println("enter your choice:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    option = true;
                    break;
                case 1:
                    System.out.println("How much would you like to deposit");
                    deposit = scanner.nextDouble();
                    account.deposit(deposit);
                    break;
                case 2:
                    System.out.println("How much would you like to deposit");
                    withdraw = scanner.nextDouble();
                    account.withdraw(withdraw);
                    break;
                case 3:
                    System.out.println("your balance is:\t" + account.displayBalance());
                    break;
                case 4:
                    System.out.println("your name\t" + customer.getName() + "\n" +
                            "your number\t" + customer.getMobileNumber() + "\n" +
                            "Account type" + account.getAccountType() + "\n" +
                            "your balance:\t" + account.getBalance());
                    break;
            }
        }
    }
}
