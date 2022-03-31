package class_5th;

public class wrapper_class {
    public static void main(String[] args) {

        Integer integerObject = new Integer(42); //Boxing
        int val = integerObject.intValue(); //Unboxing

        int intMaxVal = Integer.MAX_VALUE; // static variable
        System.out.println("intMaxVal = " + intMaxVal);

        String str1 = "1", str2 = "2.34";
        int i = Integer.parseInt(str1);
        double d = Double.parseDouble(str2);

        String str3 = Double.toString(123.99);
        String str4 = Integer.toString(4);



    }
}
