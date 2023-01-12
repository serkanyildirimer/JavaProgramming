package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {

        String sentence = "I love Java";

        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));

        String secondWord = words[1];

        String newWord = "";

        for (int i = secondWord.length() - 1; i >= 0; i--) {

            newWord += String.valueOf(secondWord.charAt(i));

        }

        words[1] = newWord;

        System.out.println(Arrays.toString(words));

//        sentence = "";
//
//        for (int i = 0; i < words.length ; i++) {
//
//            sentence += words[i] + " ";
//
//        }
//
//        System.out.println(sentence);

        for (String word : words) {
            System.out.print(word + " ");

        }

    }
}
