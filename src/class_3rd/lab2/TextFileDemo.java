package class_3rd.lab2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Lab #2-2 : Self-Service Checkout Line
 * COMP217 : Java Programming
 * Author : Prof . Youngkyoon suh
 */


public class TextFileDemo {
    public static void main(String[] args) {
        Scanner fileIn = null;
        try{
            fileIn = new Scanner(new File("C:\\Users\\jibae\\Java_Programming\\src\\class_3rd\\lab2\\player.txt"));

            int highestScore;
            String name;

            System.out.println("Text left to read? " + fileIn.hasNextLine());
            highestScore = fileIn.nextInt();
            System.out.println("Highest Score : " + highestScore);

            name = fileIn.nextLine(); //to remove '\n'
            name = fileIn.nextLine();
            System.out.println("Name : " + name);
            System.out.println("Text left to read? " + fileIn.hasNextLine());


            fileIn.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.exit(0);
        }



    }
}
