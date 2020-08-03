package com.day5;

import java.util.Scanner;

public class Student1 {
    public static void main(String[] args) {
        String name;
        String regNo;
        int Math = 0;
        int eng = 0;
        int kis = 0;
        int sci =0;
        int total;

        String grade = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        name = scanner.nextLine();
        System.out.println("enter your gerNo");
        regNo = scanner.nextLine();
        System.out.println("Enter your Math");
        Math = scanner.nextInt();
        System.out.println("Enter your eng");
        eng = scanner.nextInt();
        System.out.println("Enter your kis");
        kis = scanner.nextInt();
        System.out.println("Enter your sci");
        sci = scanner.nextInt();

        total = Math + eng + kis + sci;

        int meanGrade = total / 4;

        if (Math<=40||eng<=40||kis<=40||sci<=40){
            grade="D";
        }
        if (Math<=60||eng<=60||kis<=60||sci<=60){
            grade="C";
        }
        if (Math<=80||eng<=80||kis<=80||sci<=80){
            grade="B";
        }
        if (Math<=100||eng<=100||kis<=100||sci<=100){
            grade="A";
        }



        grade=getGrade(meanGrade);
        System.out.println("Your name is\t"+name);
        System.out.println("Your name is\t"+regNo);
        System.out.println("Your math is\t"+Math +"and your math grade is:\t"+grade);
        System.out.println("Your eng is\t"+eng+"and your eng grade is:\t"+grade);
        System.out.println("Your kis is\t"+kis +"and your kis grade is:\t"+grade);
        System.out.println("Your sci is\t"+sci+"and your sci grade is:\t"+grade);
        System.out.println("Your total is\t"+total);
        System.out.println("Your meanGrade is\t"+meanGrade);
        System.out.println("Your grade is\t"+grade);



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
