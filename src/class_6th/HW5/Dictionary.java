package class_6th.HW5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
    private Map<String, ArrayList<String>> map;

    public Dictionary() {
        map = new HashMap<>();
    }

    public void AddTerm(String Key) {

        ArrayList<String> values = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            String temp;
            System.out.print("Please enter a synonym(until you enter '-1') : ");
            temp = sc.nextLine();
            if (temp.equals("-1")) break;

            values.add(temp);
        }

        map.put(Key, values);
    }

    public void SearchTerm(String Key) {
        if (map == null || map.get(Key) == null || Key == null) {
            System.out.println("Invalid values");
            return;
        }

        System.out.print("Term : " + Key + "     ");
        System.out.println("SynonymList : " + map.get(Key));
    }

    public void DeleteTerm(String Key) {
        if (map == null || map.get(Key) == null || Key == null) {
            System.out.println("Invalid values");
            return;
        }

        map.remove(Key);
        System.out.println("Deleted.");
    }

    public void DisplayAll() {
        for (String s : map.keySet()) {
            System.out.print("Term : " + s + "   ");
            System.out.println("SynonymList : " + map.get(s));
        }
    }

}
