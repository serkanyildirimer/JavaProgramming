package day25_CustomMethods_Overloading;

import java.sql.Array;
import java.util.Arrays;

public class AddElementsToArray {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 6, 8, 9};

        int[] result = addInteger(a, 5);

        System.out.println(Arrays.toString(result));


        double[] arr = {1.2, 3.3, 8.99};

        double b2 = 4.5;

        double[] result2 = addDouble(arr, b2);

        System.out.println(Arrays.toString(result2));

        String[] arrString = {"kk", "ewqeqw", "dadasaa"};
        String dd = "qweqwewqewqeqw";

        String[] result3 = addString(arrString, dd);

        System.out.println(Arrays.toString(result3));


    }

    public static int[] addInteger(int[] a, int b) {

        int[] arrayLast = new int[a.length + 1];

        for (int i = 0; i < a.length; i++) {

            arrayLast[i] = a[i];

        }


        arrayLast[a.length] = b;


        return arrayLast;
    }

    public static double[] addDouble(double[] a, double b) {

        double[] arrayLast = new double[a.length + 1];

        int i = 0;
        for (double each : a) {

            arrayLast[i++] = each;

        }


        arrayLast[a.length] = b;


        return arrayLast;
    }

    public static String[] addString(String[] a, String b) {

        String[] arrayLast = new String[a.length + 1];

        int i = 0;
        for (String each : a) {

            arrayLast[i++] = each;

        }


        arrayLast[a.length] = b;


        return arrayLast;
    }

    public static char[] addchar(char[] a, char b) {

        char[] arrayLast = new char[a.length + 1];

        int i = 0;
        for (char each : a) {

            arrayLast[i++] = each;

        }


        arrayLast[a.length] = b;


        return arrayLast;
    }


}
