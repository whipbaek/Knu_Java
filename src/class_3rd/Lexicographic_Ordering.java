package class_3rd;

public class Lexicographic_Ordering {
    public static void main(String[] args) {
        String s1 = "Hello123";
        String s2 = "HeLlo123";

        /**
         * compareTo
         * s1.compareTo(s2)
         * if
         * s1이 s2보다 뒤면 true
         * s1이 s2보다 앞이면 false
         * s1과 s2가 같으면 0
         */

        int value = s1.compareTo(s2);

        if (value < 0) {
            System.out.println(s1 + " comes before " + s2);
        }else{
            System.out.println(s2 + " comes before " + s1);
        }
        value = s1.compareToIgnoreCase(s2); //don't care lower or uppercase
        if (value == 0) {
            System.out.println(s1 + " equals to " + s2);
        }
    }
}
