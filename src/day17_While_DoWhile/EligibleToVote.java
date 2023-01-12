package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("yaşınızı girin");

        int age = scanner.nextInt(); //+20

        while (age < 20 || age > 120) {

            System.out.println("oy kullanamazsınz");
            age = scanner.nextInt();
        }

        System.out.println("yaşınız " + age + " ve oy kullanabilirisinz.");

    }
}