package class_6th;

import java.util.ArrayList;

public class Arraylist_test {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");

        for (String val : arrayList) System.out.print(val + " ");

        System.out.println();
        arrayList.add(1,"NEW_FIRST"); //어디에 저장되는가?
        arrayList.add(2,"NEW_SECOND"); //어디에 저장되는가?

        for (String val : arrayList) System.out.print(val + " ");

    }
}
