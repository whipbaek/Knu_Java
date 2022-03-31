package class_5th.lab4;

import java.util.Scanner;

public class RoundStuff {

    public static double area(double radius) {
        return Math.PI*(Math.pow(radius,2));
    }

    public static double volume(double radius) {
        return (4.0/3.0)*(Math.PI)*(Math.pow(radius,3));
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter radius : ");

        double radius = keyboard.nextDouble();

        System.out.println("A circle of radius " + radius + " inches");
        System.out.println("has an area of " + area(radius) + " square inches");

        System.out.println("A sphere of radius " + radius + " inches");
        System.out.println("has an volume of " + volume(radius) + " cubic inches");

        keyboard.close();
    }
}
