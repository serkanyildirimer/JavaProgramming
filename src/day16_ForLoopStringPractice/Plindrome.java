package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Plindrome {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a word for checking palindrome");

        String input = scanner.next();

        String inputReverse = "";


        for (int i = input.length() - 1; i >= 0; i--) {

            inputReverse += input.charAt(i);
        }

        boolean palindrome = input.equalsIgnoreCase(inputReverse);


        System.out.println(input);

        System.out.println(inputReverse);

        System.out.println("isPalindrome " + palindrome);

        scanner.close();

    }
}
