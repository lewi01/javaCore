package com.day7;

import java.util.Scanner;

public class StudentGrade1 {
    public static void main(String[] args) {

        String name = "";
        String regNo = "";
        int numberOfStudents=0;
//        int eng = 0;
//        int math = 0;
//        int kis = 0;
//        int sci = 0;
//        int bio = 0;
       int total=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of students");
        numberOfStudents=scanner.nextInt();
        if (numberOfStudents>0) {
            int score=0;
            int meanGrade=0;
            for (int i = 0; i < numberOfStudents; i++) {
                System.out.println("Enter your name");
                name = scanner.next();
                System.out.println("Enter your regNo");
                regNo = scanner.next();
//                System.out.println("Enter your Math");
//                math = scanner.nextInt();
//                System.out.println("Enter your eng");
//                eng = scanner.nextInt();
//                System.out.println("Enter your kis");
//                kis = scanner.nextInt();
//                System.out.println("Enter your sci");
//                sci = scanner.nextInt();
//                System.out.println("Enter your bio");
//                bio = scanner.nextInt();

//                total=math+eng+kis+sci+bio;
//                int meanGrade=total/5;
                System.out.println("no of subjects");
                int noOfSubjects=scanner.nextInt();
                for (int j=0;j<noOfSubjects;j++){
                    System.out.println("enter your subject");
                    String a=scanner.next();
                    System.out.println("enter your score");
                     score=scanner.nextInt();

                }
                total+=score;
                System.out.println("your name\t"+name);
                System.out.println("your regNo\t"+regNo);
                System.out.println("your total\t"+total);
                System.out.println("your mean\t"+getMean(score,noOfSubjects));
                System.out.println("your grade\t"+getGrade(score,noOfSubjects));

            }

        }

    }
    private  static int getMean(int score,int noOfSubjects){

        return (score)/noOfSubjects;
    }
   private static String getGrade(int total,int noOfSubject) {
        String grade="";

        if (getMean(total,noOfSubject)>80&&getMean(total,noOfSubject)<=100){
            grade="A";

        }
        else if (getMean(total,noOfSubject)>60&&getMean(total,noOfSubject)<=80){
            grade="B";
        }
        else if (getMean(total,noOfSubject)>40&&getMean(total,noOfSubject)<=60){
            grade="C";
        }
        else {
            grade="D";
        }
        return grade;
    }
//
}
