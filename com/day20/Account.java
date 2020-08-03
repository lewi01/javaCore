package com.day20;

public class Account {
    private NationalID customerID;
    private double balance;
    private  AccountType accountType;
    public Account() {
    }

    public Account(AccountType accountType, NationalID customerID, double balance) {
        this.accountType = accountType;
        this.customerID = customerID;
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public NationalID getCustomerID() {
        return customerID;
    }

    public void setCustomerID(NationalID customerID) {
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
