package day26_CustomMethodPractice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] a = {1,1,1,1,1,1,1,2,2,3,3,31,1,1,1};

        int b = 1;

        int result = FrequencyOfElement.frequencyOfElement(a,b);

        System.out.println(result);

        System.out.println("----------------------");

        double[] c = {1.1,1.2,1.1,1,1,1,1,2,2,3,3,31,1.1,1,1.2};

        double d = 1.1;

        int result2 = FrequencyOfElement.frequencyOfElement(c,d);

        System.out.println(result2);

        System.out.println("------------------------------");

        int[] a1 = {1,12,12,13,13,15,8};

        int b1= 15;

        int[] result3 = RemoveElements1.removeElement(a1,b1);

        System.out.println(Arrays.toString(result3));

        System.out.println("-------------------------------------------");

        int[] a3 = {1,2,3,3,4,5,6,};

        int[] b3 = {10,20,30,40};

        int[] result4 = MergeArrays.mergeArrays(a3,b3);

        System.out.println(Arrays.toString(result4));


    }
}
