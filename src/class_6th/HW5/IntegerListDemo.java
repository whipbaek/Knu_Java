package class_6th.HW5;

import java.util.Scanner;

public class IntegerListDemo {
    public static void main(String[] args) {
        System.out.print("Enter the size of an array : ");
        IntegerList integerList = new IntegerList(new Scanner(System.in).nextInt());

        System.out.println(integerList);
        System.out.println("The smallest number is : " + integerList.findMinElement());
        integerList.findMaxAddition();
        System.out.println("Are there any duplicate elements in the array? : " + integerList.findDuplicateElements());
        integerList.reverseArray();
        System.out.println("Reverse Array\n" + integerList);
    }
}
