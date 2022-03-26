package class_4th.lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your last name, \n"
                + "a comma, your  first name, and course name in order");
        String inputline = keyboard.nextLine();

        StringTokenizer stringTokenizer = new StringTokenizer(inputline, ",| ");
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());

        }
        
        keyboard.close();
    }
}
