package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> listtt = new ArrayList<>();

        listtt.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));

        System.out.println(listtt);

        listtt.removeAll(Arrays.asList(3,5));

        System.out.println(listtt);

        ArrayList<Integer> listtt2 = new ArrayList<>();

        listtt2.addAll(Arrays.asList(100,200,300,400,500,600,700));

        System.out.println(listtt2);

        listtt2.retainAll(Arrays.asList(100,200));

        System.out.println(listtt2);

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,0,12,123,13,123123,1312,45));

        boolean r1 = list.containsAll(Arrays.asList(1,2,3,4,5));

        Integer[] arr = {1,2,3,4,5,6,7};

        ArrayList<Integer> arrL = new ArrayList<>(Arrays.asList(arr));

        System.out.println(arrL);

        ///
        ArrayList<String> jobTitles = new ArrayList<>();

        jobTitles.addAll(Arrays.asList("qa", "SDET", "developer" , "scrum master"));

        jobTitles.retainAll(Arrays.asList("developer"));

        System.out.println(jobTitles);

        boolean r4 = jobTitles.containsAll(Arrays.asList("aq", "qa"));

        System.out.println(r4);


///





    }
}
