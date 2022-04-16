package class_8th.lab8;

public class CopyingDemo implements Cloneable{
    public static Sale[] badCopy(Sale[] a){
        Sale[] b = new Sale[a.length];
        for(int i=0; i<a.length; i++) b[i] = new Sale(a[i]);
        return b;
    }

    public static Sale[] goodCopy(Sale[] a){
        Sale[] b = null;
        b=a.clone();
        return b;
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {
        Sale[] a = new Sale[2];
        a[0] = new Sale("atomic coffee mug", 130.00);
        a[1] = new DiscountSale("invisible paint",5.00, 10);

        int i;

        Sale[] b = badCopy(a);

        System.out.println("With copy constructors");
        for(i =0; i<a.length; i++){
            System.out.println("a["+i+"] = " + a[i]);
            System.out.println("b[" + i + "] = " + b[i] + "\n");
        }
        System.out.println();

        b = goodCopy(a);
        System.out.println("With clone method:");
        for(i =0; i<a.length; i++){
            System.out.println("a["+i+"] = " + a[i]);
            System.out.println("b[" + i + "] = " + b[i] + "\n");
        }
        System.out.println();
    }
}
