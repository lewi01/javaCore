package com.day19;

public class Customer {
    private int id;
    private String idNumber;
    private String fullName;
    private String gender;

    public Customer(int id, String idNumber, String fullName, String gender) {
        this.id = id;
        this.idNumber = idNumber;
        this.fullName = fullName;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
