package utilities;

import java.util.Arrays;

public class StringUtilities {

    public static boolean anagram (String str1, String str2){

        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);

    }

    public static String removeDuplicates (String a){

       String result = "";

        for (int i = 0; i < a.length(); i++) {

            String each = String.valueOf(a.charAt(i));

            if (!result.contains(each)){
                result += each;
            }

        }


        return result;
    }
}
