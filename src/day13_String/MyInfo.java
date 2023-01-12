package day13_String;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter ur age");
        int age = input.nextInt();


        System.out.println("enter ur gender");
        String gender = input.next();

        input.nextLine();

        System.out.println("enter your full name");
        String fullName = input.nextLine();

        System.out.println("enter ur phone number");
        Long phoneNumber = input.nextLong();

        System.out.println("enter ur zip code");
        int zipCode = input.nextInt();

        input.nextLine();

        System.out.println("enter ur schollname");
        String schoolName = input.nextLine();

        System.out.println("enter ur city name");
        String cityName = input.nextLine();

        System.out.println("enter your state name");
        String stateName = input.next();

        System.out.println("enter your building number");
        int buildingNumber = input.nextInt();

        input.nextLine();

        System.out.println("enter your street name");
        String streetName = input.nextLine();


        System.out.println("personel bilgileriniz ekrandanır: " + age + "\n" + gender + "\n" + fullName + "\n" + phoneNumber + "\n" + zipCode + schoolName + cityName + stateName + buildingNumber + streetName);


        input.close();


    }
}
/*
1. Create a class called MyInfo. Write a program that can ask the user to:
			1. Enter your age (int)
			2. Enter your gender (String- One word ONLY)
			3. Enter your full name (String- Multiple words)
			4. Enter your phone number (long)
			5. Enter your zip code (int)
			6. Enter your School name (String- Can be Multiple words)
			7. Enter your city name (String- Can be Multiple words)
			8. Enter your state name (String- One word ONLY)
			9. Enter your building number (int)
			10. Enter your Street name

		MAKE SURE USER CAN ENTER ALL THE INPUT

		Display all the inputs that user entered in following order in sperate lines:


 */