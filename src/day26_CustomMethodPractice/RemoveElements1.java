package day26_CustomMethodPractice;

import java.util.Arrays;

public class RemoveElements1 {

    public static int[] removeElement(int[] array, int index) {

         //int [] a = Arrays.sort(array);

//        if ((index < 0) || (index > (a.length - 1))) {
//            System.err.println("Invalid Index: " + index);
//            System.exit(0);
//        }

        int[] result = new int[array.length - 1];

        int j = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (i == index) {     //if the element of array is matching with the element at given index
                continue;           //skip

            }

            result[j++] = array[i];
        }

        return result;
    }
}
