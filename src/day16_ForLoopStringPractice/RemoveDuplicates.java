package day16_ForLoopStringPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "aabbccbc";

        String corrected = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            String ch = "" + str.charAt(i);

            if (!corrected.contains(ch)) {
                corrected += str.charAt(i);
            }


        }

        System.out.println(corrected);


    }
}
