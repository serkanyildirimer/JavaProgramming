package day12_Scanner;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter ur score number");

        int score = input.nextInt();

        boolean valid = score >= 0 && score <= 100;

        char result = 'A';

        if (valid) {

            result = (score >= 80) ? 'A' : (score >= 60) ? 'B' : (score >= 40) ? 'C' : (score >= 20) ? 'D' : 'F';

            System.out.println(result);
        } else {
            System.out.println("invalid number");

        }


        input.close();


    }
}
