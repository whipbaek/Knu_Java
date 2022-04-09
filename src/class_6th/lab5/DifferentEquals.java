package class_6th.lab5;

public class DifferentEquals {
    private final static int NUMELEM = 10;

    public static void main(String[] args) {
        int [] c = new int[NUMELEM];
        int [] d = new int[NUMELEM];

        for (int i = 0; i < NUMELEM; i++) {
            c[i] = i;
            d[i] = i;
        }

        if(c == d){ //compare by memory ( "==" operator)
            System.out.println("c and d are equal by ==.");
        }
        else{
            System.out.println("c and d are not equal by ==.");
        }

        System.out.println("== only tests memory addresses.");

        if(equalArrays(c,d)){
            System.out.println("c and d are equal by the equalArrays method.");
        } else{
            System.out.println("c and d are not equal by the equalArrays method.");
        }

        System.out.println("And equalArrays method is usually a more useful test.");
    }

    private static boolean equalArrays(int[] c, int[] d) {
        if(c.length != d.length) return false;
        for(int i=0; i<c.length; i++){
            if(c[i] != d[i]) return false;
        }
        return true;
    }
}
