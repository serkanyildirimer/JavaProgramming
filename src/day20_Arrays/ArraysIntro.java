package day20_Arrays;

import java.sql.Array;
import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        String[] myGroup = new String[5];

        myGroup[0] = "gunay";
        myGroup[1] = "serkan";
        myGroup[2] = "osman";
        myGroup[3] = "ali";
        myGroup[4] = "semih";

        System.out.println(myGroup[1]);

        System.out.println(Arrays.toString(myGroup)); //hashcode

        System.out.println("---------------------------------------------------");

        String[] days = {"monday", "tuesday", "wednasday", "f", "thr"};

        System.out.println(Arrays.toString(days));

        System.out.println("--------------------------------------");

        System.out.println(days);


    }
}
