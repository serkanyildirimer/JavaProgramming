package day15_ForLoop;

import java.util.Scanner;

public class ReverseChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("bir kelime giirin");
        String givenWord = input.next();

        int lastchar = givenWord.length();

        char result = ' '; //= String.valueOf(givenWord.charAt(givenWord.length()) + givenWord.charAt()         + givenWord.charAt(0));

        //String result = String.valueOf(givenWord.charAt(givenWord.length()) + givenWord.charAt()         + givenWord.charAt(0));



//        for (int i = 1; i <= givenWord.length(); i++) {

//            result = givenWord.charAt(i)

//            }

        String lastWord = String.valueOf(givenWord.charAt(lastchar));

        System.out.println(lastWord);
    }
}
