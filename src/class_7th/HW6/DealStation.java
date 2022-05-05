package class_7th.HW6;

import java.util.ArrayList;
import java.util.Scanner;

public class DealStation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<PubTrasp> pubTrasps = new ArrayList<>();
        System.out.println(" :: Welcome to DealStation ::");
        int i=0;
        while (true) {

            System.out.println("Which public transportation ticket would you like to buy?\n(Bus | Subway | Taxi)");
            String category = sc.nextLine();
            switch (category) {
                case "Bus":
                    Bus bus = new Bus();
                    pubTrasps.add(bus);
                    break;
                case "Subway":
                    Subway subway = new Subway();
                    pubTrasps.add(subway);
                    break;
                case "Taxi":
                    Taxi taxi = new Taxi();
                    pubTrasps.add(taxi);
                    break;
            }

            System.out.println("Which ticket would you buy? Please select one of the followings:\n" + pubTrasps.get(i).getFareList());
            pubTrasps.get(i).setFare(sc.nextLine());
            if(pubTrasps.get(i) == null) System.out.println("null이야!!!!!");

            System.out.println("What is your payment method? Please select one of the followings:\n" + pubTrasps.get(i).getPaymentList());
            pubTrasps.get(i).setPayment(sc.nextLine());

            System.out.println("Where is your destination? Please select one of the followings:\n" + pubTrasps.get(i).getSectionList());
            pubTrasps.get(i).setSection(sc.nextLine());

            System.out.println("Which transportation do you prefer? Please select one of the followings:\n" + pubTrasps.get(i).getTypeList());
            pubTrasps.get(i).setType(sc.nextLine());

            if(pubTrasps.get(i) instanceof Taxi){
                System.out.println("How far does the taxi travel? Please select one of the followings:\n" + ((Taxi) pubTrasps.get(i)).getDistanceList());
                ((Taxi) pubTrasps.get(i)).setDistance(sc.nextInt());
            }

            System.out.println("Do you want to buy another transportation ticket? (y | n)");
            char more = sc.next().charAt(0);
            sc.nextLine();
            if(more == 'y' || more == 'Y'){
                i++;
                continue;
            }

            break;
        }


        System.out.println("Thank you for your purchase. Here are your purcahse summary:\n");
//        System.out.println(pubTrasps.get(i).toString());
        int j=1;
        for (PubTrasp pubTrasp : pubTrasps) {
            System.out.println("Purchase " + (j++) + ":\n" + pubTrasp.describePubTrasp()+'\n');
        }

    }
}
