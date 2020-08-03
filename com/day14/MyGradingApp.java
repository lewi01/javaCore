package com.day14;

import java.util.ArrayList;
import java.util.Scanner;

public class MyGradingApp {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        ArrayList<Student> students=new ArrayList<>();
        Teacher teacher=new Teacher("Mr. John","45352","2547772222");

//        System.out.println("Enter No of Students");
//        int noOfStudents = scanner.nextInt();
//
//        if (noOfStudents > 0 ){
//            for (int i=0; i < noOfStudents; i++){
//                ArrayList<Subject> subjects=new ArrayList<>();
//                System.out.println(" Enter name of the student");
//                String name=scanner.next();
//
//                System.out.println(" Enter name of the student regNo");
//                String regNo=scanner.next();
//
//                System.out.println(" Enter name of the student address");
//                String address=scanner.next();
//                System.out.println("Enter No of Subjects");
//                int noOfSubjects = scanner.nextInt();
//                if (noOfSubjects > 0){
//                    for (int k=0; k < noOfSubjects; k++) {
//                        System.out.println(" Enter name of the subject");
//                        String subjectName = scanner.next();
//                        System.out.println(" Enter score");
//                        double score = scanner.nextDouble();
////                        Subject subject=new Subject(subjectName,score, MyFunctions.getGrade(score),teacher);
////                        subjects.add(subject);
//                        subjects.add(new Subject(subjectName,score, MyFunctions.getGrade(score),teacher));
//                    }
//                }
//                students.add(new Student(name,regNo,address,subjects));
//            }
//        }
//
//        if (students.size() > 0){
//            for (Student student: students
//            ) {
//                System.out.println("Name :" +student.getName());
//                System.out.println("Reg NO :" +student.getRegNumber());
//                System.out.println("Address :" +student.getAddress());
//                double totalMarks=0;
//                System.out.println("--SUBJECTS---");
//                if (student.getSubjects().size() > 0){
//                    for (Subject subject: student.getSubjects()
//                    ) {
//                        System.out.println("Name :" +subject.getName());
//                        System.out.println("Score :" +subject.getScore());
//                        System.out.println("Grade :" +subject.getGrade());
//
//                        System.out.println("Teacher :" +subject.getTeacher().getName());
//
//                        totalMarks += subject.getScore();
//                    }
//                }
//
//
//            }
        }


    }
//}
