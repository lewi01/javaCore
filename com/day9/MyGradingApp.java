package com.day9;

import java.util.Scanner;

public class MyGradingApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "";
        String regNo = "";
        int noOfStudents = 0;
        int totalScore = 0;

        System.out.println("enter no of students");
        noOfStudents = scanner.nextInt();
        if (noOfStudents > 0) {
            int count = 1;
            String subject="";
            int noOfSubject=0;
            int score=0;

            while (count <= noOfStudents) {
                System.out.println("enter your name");
                name = scanner.next();
                System.out.println("enter your regNo");
                regNo = scanner.next();
                System.out.println("No of subjects");
                noOfSubject = scanner.nextInt();

                for (int i = 0; i < noOfSubject; i++) {
                    System.out.println("enter your subject");
                    subject = scanner.next();
                    System.out.println("enter your score");
                    score = scanner.nextInt();
                    totalScore += score;

                }
                count++;
                System.out.println("Total marks:" + totalScore);
                System.out.println("Your mean is:\t" + Functions.getMean(totalScore,noOfSubject));
                System.out.println("Your grade is:\t" + Functions.getGrade(score));
            }


        }

    }
}
