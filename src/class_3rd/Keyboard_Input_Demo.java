package class_3rd;

import java.util.Scanner;

public class Keyboard_Input_Demo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number of pods followed by");
        System.out.println("the number of peas in a pod");

        int numberOfPods = keyboard.nextInt();
        int peasPerPod = keyboard.nextInt();

        int totalNumberOfPeas = numberOfPods * peasPerPod;

        System.out.println(numberOfPods + " pods and" );
        System.out.println(peasPerPod + " peas per pod.");
        System.out.println("The total number of peas = " + totalNumberOfPeas);


        String temp = keyboard.nextLine(); //remove '\n'

        String next = keyboard.nextLine();

        System.out.println("next = " + next);

    }
}
