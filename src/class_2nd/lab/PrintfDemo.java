package class_2nd.lab;

/**
 * COMP217 : Java Programming
 * Lab #1-3 : Exercising the printf method
 * Prof : Suh, Yongkyoon
 */

public class PrintfDemo {
    /**
     *
     * @param args
     */

    public static void main(String[] args) {
        String aString = "abc";
        int dummyIntNum = 1234567890;

        final String START = "START";
        final String END = "END";

        System.out.println("String output: ");
        System.out.printf("%s%d\n", START, dummyIntNum);

        System.out.printf("%s%s%s\n", START, aString, END);
        System.out.printf("%-6s%s%s\n", START, aString, END);
        System.out.printf("%s%s%4s\n", START, aString, END);

        System.out.println();

        char oneCharacter = 'z';
        System.out.println("Character output: ");
        System.out.printf("%s%c%s\n", START, oneCharacter, END);
        System.out.printf("%-9s%c%s\n", START, oneCharacter, END);

        System.out.println();

        double d = 12345.123456789;
        System.out.println("Floating-point output: ");
        System.out.printf("%s%.6f%s\n", START, d, END);
        System.out.printf("%s%.4f%s\n", START, d, END);
        System.out.printf("%s%.3f%4s\n", START, d, END);
        System.out.printf("%s%.2f%s\n", START, d, END);
        System.out.printf("%-7s%.4f%s\n", START, d, END);
        System.out.printf("%s%.6e%s\n", START, d, END);
        System.out.printf("%-6s%.6e%s\n", START, d, END);

        System.out.printf("");
    }
}
