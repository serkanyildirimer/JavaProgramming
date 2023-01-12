package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double average = 0;

        int[] givenNumber = new int[10];


        for (int i = 0; i < 10; i++) {

            System.out.println("You can write a number");
            givenNumber[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(givenNumber));

        System.out.println("----------------------------------------------");

        for (int i = 0; i < givenNumber.length; i++) {

            average += givenNumber[i];

        }

        System.out.println("toplam : " + average);

        average = average / givenNumber.length;

        System.out.println(average);

    }


}

