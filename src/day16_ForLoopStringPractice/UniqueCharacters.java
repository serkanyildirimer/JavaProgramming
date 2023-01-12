package day16_ForLoopStringPractice;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aabccdkd";


        for (int i = 0; i <= str.length() - 1; i++) {

            char ch = str.charAt(i);

            boolean isunique = str.lastIndexOf(ch) == str.indexOf(ch);

            if (isunique) {
                System.out.println("isunique: " + ch);

            }
        }


    }
}
