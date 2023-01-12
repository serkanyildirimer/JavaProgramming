package day26_CustomMethodPractice;

public class MergeArrays {

    public static int[] mergeArrays(int[] array, int[] barry) {

        int[] result = new int[array.length + barry.length];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }

        //int j = array.length -1;

        for (int each : barry) {
            result[i++] = each;
        }

        return result;

    }
}
