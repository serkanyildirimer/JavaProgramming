package day17_While_DoWhile;

public class FrequencyOfDeleting {
    public static void main(String[] args) {

        String str = "Java Java Java Python";

        int freq = 0;

        for (int i = 0; i < str.length() - 4; i++) {
            String find = str.substring(i,i+4);

            if (find.equals("Java")) {
                str = str.replaceFirst("Java","");
            }

        }

        System.out.println(str);

    }
}
