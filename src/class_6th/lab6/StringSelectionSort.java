package class_6th.lab6;

import java.util.ArrayList;

public class StringSelectionSort {
    public static void sort(ArrayList<String> stringArrayList) {

        System.out.println("ArrayList values before sorting :");
        for (String s : stringArrayList) System.out.println(s);


        for (int i = 0; i < stringArrayList.size(); i++) {
            int idx = i;
            int val = 0;
            for (int j = i + 1; j < stringArrayList.size(); j++) {
                if (stringArrayList.get(i).compareTo(stringArrayList.get(j)) > val) {
                    val = stringArrayList.get(i).compareTo(stringArrayList.get(j));
                    idx = j;
                }
            }

            String temp = stringArrayList.get(i);
            stringArrayList.set(i, stringArrayList.get(idx));
            stringArrayList.set(idx, temp);

        }

        System.out.println("ArrayList values after sorting :");
        for (String s : stringArrayList) System.out.println(s);
    }

}
