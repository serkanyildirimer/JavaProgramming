package day24_CustomMethods_Return;

public class ReturnMethodsPractice3 {
    public static void main(String[] args) {

        String first = "kkknk";
        char which = 'k';

        int result = frequency(first,which);

        System.out.println(result);


    }

    public static int frequency (String a, char b){

        int freq = 0;

        for (int i = 0; i < a.length(); i++) {
            char choosed = a.charAt(i);

            if (choosed==b){
                freq++;
            }

        }


        return freq;
    }

}
