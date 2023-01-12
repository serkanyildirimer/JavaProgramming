package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter ur age");

        int age = input.nextInt();

        input.nextLine();

        System.out.println("enter ur full name");

        String fullName = input.nextLine();

        System.out.println("ur age: " + age);
        System.out.println("ur full name: " + fullName);

        input.close();


    }
}



//