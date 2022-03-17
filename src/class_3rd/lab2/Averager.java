package class_3rd.lab2;

/**
 * Lab #2-4 : Averaging a List of Scores
 * COMP217 : Java Programming
 * Author : Prof . Youngkyoon suh
 */

import java.util.Scanner;

public class Averager {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a list of nonnegative scores.");
        System.out.println("Mark the end with a negative number.");
        System.out.println("I will compute their average");

        double next, sum = 0;
        int count = 0;

        do{
            next = keyboard.nextDouble();
            sum += next;
            count++;
        }while(next >= 0);

        sum -= next;
        count--;

        if(count == 0){
            System.out.println("No scores entered");
        }else{
            System.out.println(count + "scores read");
            System.out.println("The average is " + sum/count);
        }

        keyboard.close();
    }
}
