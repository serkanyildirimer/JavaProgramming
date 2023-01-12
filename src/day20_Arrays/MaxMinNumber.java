package day20_Arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int maxNumber = 0;
        int minNumber = 1000;


        int[] givenNumber = new int[10];


        for (int i = 0; i < 10; i++) {

            System.out.println("You can write a number");
            givenNumber[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(givenNumber));

        System.out.println("----------------------------------------------");

        for (int i = 0; i < givenNumber.length; i++) {

            if (givenNumber[i] > maxNumber) {
                maxNumber = givenNumber[i];
            }

            minNumber += maxNumber;

            if (givenNumber[i] < minNumber) {
                minNumber = givenNumber[i];
            }

        }

        System.out.println("max number : " + maxNumber);
        System.out.println("min number : " + minNumber);

        input.close();

    }
}
