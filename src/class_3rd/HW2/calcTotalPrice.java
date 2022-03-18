package class_3rd.HW2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class calcTotalPrice {

    public static void main(String[] args) {
        int cnt=1;

        DecimalFormat df = new DecimalFormat("#.0");
        DecimalFormat dollar = new DecimalFormat("'$'#.##");
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> quantity = new ArrayList<>();
        ArrayList<Integer> price = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<4; i++){
            System.out.println("Name of item " + cnt + ": ");
            name.add(sc.next());
            System.out.println("Quantity of item " + cnt + ": ");
            quantity.add(sc.nextInt());
            System.out.println("Price of item " + cnt + ": ");
            price.add(sc.nextInt());
            cnt++;
        }
        System.out.println("Item      Quantity  Price  Total");

        double total=0;
        double tax=0.0;
        int value=5;

        for(int i=0; i<4; i++){
            int sum = quantity.get(i)*price.get(i);
            total += sum;
            System.out.printf("%d. %-8s %-8d %-6d %d",i+1,name.get(i),quantity.get(i),price.get(i),sum);
            System.out.println();
        }
        tax = total*0.05;
        System.out.printf("Subtotal%23.0f\n",total);
        System.out.printf("5%% sales tax %18s\n",df.format(tax));
        total += tax;
        System.out.println("Your Total Price is " + dollar.format(total));

    }
}
