package com.day14;

public class Subject {
    private String name;
    private double score;
    private String grade;
    private Teacher teacher;

    public Subject(String name, double score, String grade, Teacher teacher) {
        this.name = name;
        this.score = score;
        this.grade = grade;
        this.teacher = teacher;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
