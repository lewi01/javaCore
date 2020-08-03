package com.day19;

public class Account {
        private int customerId;
        private String accountNumber;
        private AccountType accountType;
        private double balance = 0;


        public Account(int customerId, String accountNumber, AccountType accountType, double balance) {
            this.customerId = customerId;
            this.accountNumber = accountNumber;
            this.accountType = accountType;
            this.balance = balance;
        }

        public int getCustomerId() {
            return customerId;
        }

        public void setCustomerId(int customerId) {
            this.customerId = customerId;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public AccountType getAccountType() {
            return accountType;
        }

        public void setAccountType(AccountType accountType) {
            this.accountType = accountType;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
}
