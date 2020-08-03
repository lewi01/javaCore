package com.day15;

import java.util.ArrayList;

public class Account {
    private  String accountType;
    private  String currencyType;
    private int customerID;
    private double balance;

    public Account() {
    }

    public Account(String accountType, String currencyType, int customerID, double balance) {
        this.accountType = accountType;
        this.currencyType = currencyType;
        this.customerID = customerID;
        this.balance = balance;

    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double deposit(double amount){
        if (amount <= 50) {
            System.out.println("Invalid");
        }
        else{
           balance= balance + amount;
        }
        return balance;
    }

    public double withdraw(double amount){

        if (balance < amount) {
            System.out.println("Invalid amount.");
        }
        else {
            balance = balance - amount;
        }
        return balance;
    }

   public  double displayBalance(){
        return balance;
   }



}
