package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveZeros {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        System.out.println(list);

        int size = list.size();

        list.removeAll(Arrays.asList(0));

        System.out.println(list);

        int newSize = list.size();

        int totalNumberOfZeros = size - newSize;

        System.out.println("totalnumberofZeros = " + totalNumberOfZeros);

        for (int i = 0; i < totalNumberOfZeros; i++) {

            list.add(0);

        }

        System.out.println(list);

        System.out.println("-----------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list2) {
            if (each != 0) {
                result.add(each);
            }

        }

        for (Integer each : list2) {
            if (each == 0) {
                result.add(each);
            }

        }

        System.out.println(result);

        System.out.println("---------------------------------");

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> chars = new ArrayList<>();

        //  ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<String> list3 = new ArrayList<>();
        // ArrayList<String> list4 = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));

        }

        ArrayList<Character> letters = new ArrayList<>(chars);

        letters.removeIf(p -> !Character.isLetter(p));

        ArrayList<Character> list1 = new ArrayList<>(letters);

        System.out.println(list1);

        ArrayList<Character> listDigit = new ArrayList<>(chars);

        listDigit.removeIf(p -> !Character.isDigit(p));

        System.out.println(listDigit);


    }
}
