package com.day15;

public class Customer {

    private String name;
    private String address;
    private int mobileNumber;
    private int pin;

    public Customer() {
    }

    public Customer(String name, String address, int mobileNumber, int pin) {
        this.name = name;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
