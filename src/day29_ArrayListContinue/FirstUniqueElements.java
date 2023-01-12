package day29_ArrayListContinue;

import java.util.ArrayList;

public class FirstUniqueElements {
    public static void main(String[] args) {

        ArrayList<String> newarray = new ArrayList<>();

        newarray.add("serkan");
        newarray.add("serkan");
        newarray.add("serkan22");
        newarray.add("serkan33");
        newarray.add("serkan33");
        newarray.add("serkan331");
        newarray.add("serkan33");

        System.out.println(newarray);

        String firstUniqueElement = "";


        for (String each : newarray) {

            int freq = 0;

            for (int i = 0; i < newarray.size(); i++) {
                if (each == newarray.get(i)) {
                    freq++;
                }


            }
            if (freq == 1) {
                System.out.println(each + "is First Unique Element");
                break;
            }


        }


    }
}
