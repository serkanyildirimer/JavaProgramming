package day11_Switch_Scanner;

public class NumberToWords {

    public static void main(String[] args) {

        int a = 10;
        String result = "";

        boolean rightNumber = a <= 9 && a >= 0;

        if (rightNumber) {

            if (a == 1) {
                System.out.println("Ali");
            } else if (a == 2) {

                System.out.println("ahmet");
            } else if (a == 3) {

                System.out.println("mehmet");

            } else if (a == 5) {
                System.out.println("tarık");
            }

        }

        System.out.println(" not 0-9 area");


    }
}

 /*

 Write a program that can convert numbers 0 - 9 TO WORDS
  */