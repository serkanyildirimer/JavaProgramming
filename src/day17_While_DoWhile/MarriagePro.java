package day17_While_DoWhile;

import java.util.Scanner;

public class MarriagePro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Marry me yes/no");

        String answer = scanner.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.out.println("please answer again with yes or no");

            System.out.println("will u marry me");

            answer = scanner.next().toLowerCase();
        }


        if (answer.equals("yes")) {
            System.out.println("congrats");
        } else {
            System.out.println("goodby");

        }
    }
}
