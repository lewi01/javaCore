package com.day14;

import javax.security.auth.Subject;
import java.util.ArrayList;

public class Student {
    private String name;
    private String regNumber;
    private String address;
    private ArrayList<Subject> subjects;

    public Student(String name, String regNumber, String address, ArrayList<Subject> subjects) {
        this.name = name;
        this.regNumber = regNumber;
        this.address = address;
        this.subjects = subjects;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }
}
