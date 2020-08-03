package com.day14;

public class Teacher {
    private String name;
    private String tscNumber;
    private String mobileNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTscNumber() {
        return tscNumber;
    }

    public void setTscNumber(String tscNumber) {
        this.tscNumber = tscNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


    public Teacher(String name, String tscNumber, String mobileNumber) {
        this.name = name;
        this.tscNumber = tscNumber;
        this.mobileNumber = mobileNumber;
    }
}
