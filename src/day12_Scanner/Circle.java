package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please write your circle's radius.");

        double r = input.nextDouble();

        double area = 3.14 * r * r;    // pi r^2
        double perimeter = 2 * 3.14 * r; //2 pi r

        System.out.println("Area: " + area);
        System.out.println("perimeter: " + perimeter);

        input.close();


    }
}
/*
find circle area
perimeter
 */