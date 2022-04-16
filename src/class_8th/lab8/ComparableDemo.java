package class_8th.lab8;

public class ComparableDemo {
    public static void main(String[] args) {
        Double[] d = new Double[10];
        for(int i=0; i<d.length; i++) d[i] = new Double(d.length-i);

        System.out.println("<<< Double >>>");
        System.out.println("Before sorting");
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i].doubleValue()+", ");
        }
        System.out.println();

        GeneralizedSelectionSort.sort(d, d.length);

        System.out.println("After Sorting");
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i].doubleValue()+", ");
        }
        System.out.println();
        System.out.println();

        System.out.println("<<< String >>>");
        String[] a = new String[10];


    }
}
