package day16_ForLoopStringPractice;

public class Reverse {

    public static void main(String[] args) {

        String input = "Wooden Spoon"; // 01234567891011

        String result = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            result += input.charAt(i);
        }


        System.out.println(result);

    }
}
