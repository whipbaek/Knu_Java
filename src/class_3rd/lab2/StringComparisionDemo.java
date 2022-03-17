package class_3rd.lab2;

/**
 * Lab #2-3 : Comparing Strings
 * COMP217 : Java Programming
 * Author : Prof . Youngkyoon suh
 */

public class StringComparisionDemo {
    public static void main(String[] args) {
        String s1 = "Java isn't just for breakfast.";
        String s2 = "JAVA isn't just for breakfast.";

        if(s1.equals(s2)){
            System.out.println("The two lines are equal.");
        } else{
            System.out.println("The two lines are not equal.");
        }

        if(s2.equals(s1)){
            System.out.println("The two lines are equal.");
        } else{
            System.out.println("The two lines are not equal.");
        }

        if(s1.equalsIgnoreCase(s2)){
            System.out.println("But the lines are equal, ignoring case.");
        } else{
            System.out.println("Lines are not equal, even ignoring case.");
        }

        String s3 = "A cup of java is a joy forever.";

        if(s3.compareToIgnoreCase(s1) < 0){
            System.out.println("\""+s3+"\"");
            System.out.println("precedes");
            System.out.println("\""+s1+"\"");
            System.out.println("in alphabetical (or lexicographical) ordering");
        } else{
            System.out.println("\""+s3+"\"" + " does not precede " + "\""+s1+"\"");
        }
    }
}
