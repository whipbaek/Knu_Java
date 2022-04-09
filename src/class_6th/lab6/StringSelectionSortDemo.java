package class_6th.lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class StringSelectionSortDemo {
    public static void main(String[] args) {
        System.out.println("Enter a term per line. " + "For termination, enter a newline character.");

        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<String>();
        String temp;

        while (true) {
            temp = keyboard.nextLine();
            if (temp.length() == 0) break;
            arrayList.add(temp);
        }

        for (String s : arrayList) System.out.println("s = " + s);

        keyboard.close();
    }
}
