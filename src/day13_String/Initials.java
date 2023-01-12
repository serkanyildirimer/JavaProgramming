package day13_String;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

                System.out.println("name");

                String firstName = scn.next();

        System.out.println("last");

        String lastName = scn.next();



//        String firstName = "Wooden";
//        String lastName = "Spoon";

        char f = firstName.charAt(0);
        char l = lastName.charAt(0);


        String initial = f + "." + l ; //need to add string for compile all by string

        System.out.println("initial: " + initial);


    }

}
