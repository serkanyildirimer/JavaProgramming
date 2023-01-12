package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 1 to 7: ");

        int number = scan.nextInt();

        String result = "";

        if (number >= 1 && number <= 7) {
            result = (number == 1) ? "Monday" : (number == 2) ? "Tuesday" : (number == 3) ? "Wed" : (number == 4) ? "Thr" : (number == 5) ? "fr" : (number == 6) ? "sat" : "sunday";
        }

        System.out.println(result);


        scan.close();

// need close after all

    }
}
