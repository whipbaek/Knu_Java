package class_4th.HW3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketPurchase {


    public static void main(String[] args) {
        int cnt;

        Scanner sc = new Scanner(System.in);

        System.out.println(":: Welcome to Deal Station ::");

        System.out.println("How many tickets would you buy?");
        cnt = sc.nextInt();

        List<PubTrasp> list = new ArrayList<>(cnt);

        for(int i=0; i<cnt; i++){

            char correct;

            System.out.println("Provide the information of ticket " + (i+1));

            System.out.println("Which ticket would you buy? Please select one of the followings :");
            System.out.println("(Adult | Student | Child)");
            list.get(i).setFare(sc.nextLine());

            System.out.println("What is your payment method? Please select one of the followings :");
            System.out.println("(Cash | Credit card | Affiliate card)");
            list.get(i).setPayment_method(sc.nextLine());

            System.out.println("Where is your destination? Please select one of the followings :");
            System.out.println("(Zone 1 | Zone 2 | Zone 3 | Zone 4)");
            list.get(i).setSelection(sc.nextLine());

            System.out.println("Which transportation do you prefer? Please select one of the followings :");
            if(list.get(i).getSelection() == "Zone 1" || list.get(i).getSelection() == "Zone 2" ){
                System.out.println("(Regular | Private)");
            } else{
                System.out.println("(Regular | Express)");
            }

            list.get(i).setType(sc.nextLine());

            System.out.println(list.get(i).describeTicketSpec());

            System.out.println("Is this correct?");

            correct = sc.next().charAt(0);

            if(correct == 'n') continue;

        }
    }
}
