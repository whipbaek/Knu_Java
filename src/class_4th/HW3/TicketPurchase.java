package class_4th.HW3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static class_4th.HW3.PubTrasp.sequence;

public class TicketPurchase {


    public static void main(String[] args) {
        int cnt;
        int i=0;

        Scanner sc = new Scanner(System.in);

        System.out.println(":: Welcome to Deal Station ::");

        System.out.println("How many tickets would you buy?");
        cnt = sc.nextInt();
        sc.nextLine();

        ArrayList<PubTrasp> list = new ArrayList<>();
        while(true){

            list.add(new PubTrasp());
            char correct;

            System.out.println("Provide the information of ticket " + (sequence));

            System.out.println("Which ticket would you buy? Please select one of the followings :");
            System.out.println("(Adult | Student | Child)");
            String t_Fare = sc.nextLine();

            list.get(i).setFare(t_Fare);
            System.out.println("What is your payment method? Please select one of the followings :");
            System.out.println("(Cash | Credit card | Affiliate card)");
            list.get(i).setPayment_method(sc.nextLine());

            System.out.println("Where is your destination? Please select one of the followings :");
            System.out.println("(Zone 1 | Zone 2 | Zone 3 | Zone 4)");
            list.get(i).setSelection(sc.nextLine());

            System.out.println(list.get(i).getSelection());
            System.out.println("Which transportation do you prefer? Please select one of the followings :");
            if (list.get(i).getSelection().equals("Zone 1") || list.get(i).getSelection().equals("Zone 2")) {
                System.out.println("(Regular | Private)");
            } else {
                System.out.println("(Regular | Express)");
            }

            list.get(i).setType(sc.nextLine());

            System.out.println(list.get(i).describeTicketSpec());

            System.out.println("Is this correct?");

            correct = sc.next().charAt(0);
            sc.nextLine();
            if (correct == 'n') continue;

            sequence++;
            i++;

            if(sequence > cnt) break;
        }

        System.out.println("list.size = " + list.size());
        int Total=0;
        for (PubTrasp pubTrasp : list) {
            Total += pubTrasp.calculateTotalFare();
        }

        System.out.println("Your Total price : " + Total);
    }
}
