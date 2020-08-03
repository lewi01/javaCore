package com.day14;

public class MyFunctions {
    public static String getGrade(double mean){
        String grade="";
        if(mean >=0 && mean <= 40)
            grade = "D";
        else if(mean > 40 && mean <= 60)
            grade = "C";
        else if(mean > 60  && mean <= 80)
            grade = "B";
        else if(mean > 80 && mean <= 100) {
            grade = "A";
        }
        else
            grade = "F";
        return grade;
    }


    public static int getMean(int totalMarks,int noOfSubjects){
        return totalMarks/noOfSubjects;
    }

    public static double getMean(double totalMarks,int noOfSubjects){
        return totalMarks/noOfSubjects;
    }

}
