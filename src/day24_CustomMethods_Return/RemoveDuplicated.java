package day24_CustomMethods_Return;

import java.sql.Array;

public class RemoveDuplicated {
    public static void main(String[] args) {

        String a = "aaabbbbcccc";

        String result = newCleanWord(a);

        System.out.println(result);

    }

    public static String newCleanWord (String str){

        String newWord = "";

//        for (char each : str.toCharArray()){
//
//            System.out.println(each);
//
//        }

        for (int i = 0; i < str.length() ; i++) {
            char choosed = str.charAt(i);

            if (!newWord.contains("" + choosed)){
                newWord += choosed;
            }

        }


        return newWord;
    }
}
