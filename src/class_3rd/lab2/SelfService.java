package class_3rd.lab2;
/**
 * Lab #2-1 : Self-Service Checkout Line
 * COMP217 : Java Programming
 * Author : Prof . Youngkyoon suh
 */

import java.util.Scanner;

public class SelfService {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter number of items purchased");
        System.out.println("followed by the cost of one item");
        System.out.println("Do not use a dollar sign.");

        int count;
        double price, total;
        count = keyboard.nextInt();
        price = keyboard.nextDouble();
        total = count * price;

        System.out.printf("%d items at $%.2f each. \n",count, price);
        System.out.printf("Total amount due $%.2f \n",total);

        System.out.println("Please take your mechandise.");
        System.out.printf("Place $%.2f in an envelope\n",total);

        System.out.println("and slide it under the office door");
        System.out.println("Thank you for using the self-service line");
    }
}
