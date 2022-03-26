package class_4th.lab3;

public class ConstructorDemo {
    public static void main(String[] args) {
        Date tempdate = new Date(12,16,1770);

        Date date1 = new Date(tempdate);
        Date date2 = new Date(1,27,1756);
        Date date3 = new Date(1,1,1882);
        Date date4 = new Date();

        System.out.println("Whose birthday is " + date1 + "?");
        System.out.println("Whose birthday is " + date2 + "?");
        System.out.println("Whose birthday is " + date3 + "?");
        System.out.println("The default date is" + date4 + "?");

        System.out.println();
    }
}
