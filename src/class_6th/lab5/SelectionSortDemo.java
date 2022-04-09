package class_6th.lab5;

import java.util.Scanner;

public class SelectionSortDemo {
    public static void main(String[] args) {
        PartiallyFilledArray pfa = new PartiallyFilledArray(10);
        System.out.println("Enter numbers to be sorted " + "(For stop, enter a negative number");

        Scanner keyboard = new Scanner(System.in);
        while(true) {
            double temp = keyboard.nextDouble();
            if(temp < 0) break;

            pfa.add(temp);
        }
        System.out.println();

        pfa.selectionSort();
    }
}
