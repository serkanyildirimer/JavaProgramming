package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        int i = 1;
     /*   int total = 0;

        for (i = 1; i <= 100; i++) {

            total += i;
        }

        System.out.println(total);

        System.out.println("----------------------");


        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) {

            } else {
                System.out.print(i + " ");
            }
        }

        System.out.println("------------------------------");

        Scanner input = new Scanner(System.in);

        int total2 = 0;

        System.out.println("bir sayı girin");

        int givenNumber = input.nextInt();

        for (i = 1; i <= givenNumber; i++) {
            total2 += i;
        }

        System.out.println(total2);

        input.close();


        System.out.println("------------------------"); */


        Scanner input2 = new Scanner(System.in);


        System.out.println("Faktoriyeli alınacak sayıyı giriniz");

        int givenNumber2 = input2.nextInt();
        int factoriel = givenNumber2;

        for (i = 1; i <= givenNumber2; i++) {
            factoriel *= givenNumber2 - i;
        }

        System.out.println(factoriel);



    }

}
