package com.day9;

public class Functions {

    static  double getArea( double radius){
        double area = radius*radius*Math.PI;
        return area;
    }
    static double getC( double radius){
        double cur = 2*radius*Math.PI;
        return cur;
    }
    static int result(int a, int b){
        return a*b;
    }
    static int result(int a, int b ,int c){
        return a*b*c;
    }
    static double getAverage(double score){
return score;
    }
    static int getMean(int totalScore,int noOfSubjects){
        return totalScore/noOfSubjects;
    }

    static String getGrade(int meanGrade){
        String grade="";

        if (meanGrade>80&&meanGrade<=100){
            grade="A";

        }
        else if (meanGrade>60&&meanGrade<=80){
            grade="B";
        }
        else if (meanGrade>40&&meanGrade<=60){
            grade="C";
        }
        else {
            grade="D";
        }
        return grade;
    }
}
