package class_2nd.lab;

/**
 * COMP217 : Java Programming
 * Lab #1-2 : Program to show interest on a sample account balance.
 * Prof : Suh, Yongkyoon
 */


public class ShowInterest {

    public static final double INTEREST_RATE = 2.5;

    public static void main(String[] args) {

        double balance = 100;
        double interest; //as a percent
        double total; /* total amount including interest */
        System.out.println("On a balance of $ " + balance);

        System.out.println("You will earn interest of $" + INTEREST_RATE);
        System.out.println("All in just on short year.");
        System.out.println("Your total balance will be $" + (balance + INTEREST_RATE));
    }
}