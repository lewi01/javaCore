package com.day7;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {


        String name = "";
        String regNo = "";
        int eng = 0;
        int math = 0;
        int kis = 0;
        int sci = 0;
        int bio = 0;
        int option=0;
        int total=0;
        String grade="";

        Scanner scanner = new Scanner(System.in);


        while (option<=2){
                System.out.println("Enter your name");
                name = scanner.next();
                System.out.println("enter your gerNo");
                regNo = scanner.next();
                System.out.println("Enter your Math");
                math = scanner.nextInt();
                System.out.println("Enter your eng");
                eng = scanner.nextInt();
                System.out.println("Enter your kis");
                kis = scanner.nextInt();
                System.out.println("Enter your sci");
                sci = scanner.nextInt();
                System.out.println("Enter your bio");
                bio = scanner.nextInt();


        option++;
            total = math + eng + kis + sci+bio;

            int meanGrade = total / 5;
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

            System.out.println("Your name is\t"+name);
            System.out.println("Your name is\t"+regNo);
            System.out.println("Your math is\t"+math );
            System.out.println("Your eng is\t"+eng);
            System.out.println("Your kis is\t"+kis );
            System.out.println("Your sci is\t"+sci);
            System.out.println("Your bio is\t"+bio);
            System.out.println("Your bio is\t"+total);
            System.out.println("Your bio is\t"+grade);
        }






    }
}
