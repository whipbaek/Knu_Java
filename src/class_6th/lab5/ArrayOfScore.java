package class_6th.lab5;

import java.util.Scanner;

public class ArrayOfScore {
    private static final int NUMELEM = 5;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double[] score = new double[NUMELEM];
        int index;
        double max=0.0;

        System.out.println("Enter " + score.length + " scores : ");

        for(int i=0; i<score.length; i++){
            score[i] = keyboard.nextDouble();
            max = max < score[i] ? score[i] : max;
        }

        System.out.println("The highest score is " + max);
        System.out.println("The scores are : ");

        for (double v : score) {
            System.out.println(v + " differs from max by " + Math.abs(max - v));
        }
    }
}
