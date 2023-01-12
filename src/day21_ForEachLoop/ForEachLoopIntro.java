package day21_ForEachLoop;

public class ForEachLoopIntro {

    public static void main(String[] args) {


        String str1 = "axxx";
        String str2 = "dbca";

        for (int j = 0; j < str2.length(); j++) {

            for (int i = 0; i < str1.length(); i++) {
                char chr1 = str1.charAt(i);

                char chr2 = str2.charAt(j);

                if (chr1 == chr2){
                    System.out.println("karakter eşlenik : " + str1 + " deki " + chr1 + " ile " + str2 + " deki " + chr2);
                }
            }



        }



    }
}
