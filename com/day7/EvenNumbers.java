package com.day7;

public class EvenNumbers {
    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("My even number is:\t"+i);
            }

        }
        int a= 1;
        while(a<=100){

        if (a % 2 == 0)
            System.out.println("number are"+a);
            a++;
        }
        int num=1;
        do {
            if (num % 2 == 0) {
                System.out.println("even numbers are:\t"+num);
            }
            num++;
        }while(num<=100);

    }
}
