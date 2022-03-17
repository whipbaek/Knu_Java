package class_3rd.lab2;

import java.util.Random;

/**
 * Lab #2-5 : Random number generation
 * COMP217 : Java Programming
 * Author : Prof . Youngkyoon suh
 */

public class RandomNumberGeneratorDemo {
    public static void main(String[] args) {
        final int SEED = 10000;
        final int COUNTER = 10;
        Random randomNumGenerator = new Random(SEED);

        int counter = 1;
        while (counter <= COUNTER) {
            System.out.print("Random Number " + counter + ": ");
            int randNum = 0;
            do{
                randNum = randomNumGenerator.nextInt();
            }while(randNum <= 0);

            if(randNum %2 == 1) System.out.println(randNum + " an ODD number");
            else System.out.println(randNum + " an EVEN number");

            counter++;
        }
    }
}
