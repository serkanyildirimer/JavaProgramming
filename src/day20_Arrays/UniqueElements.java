package day20_Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        String[] words = {"java", "java", "c#" , "py" , "py"};

        String element = words[0]; //java
        int count = 0;

        for (int i = 0 ; i < words.length ; i++ ) {

            if (element == words[i]){
                count++;

            }


        }


    }
}
