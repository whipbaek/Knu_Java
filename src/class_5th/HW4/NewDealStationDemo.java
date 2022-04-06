package class_5th.HW4;

import java.util.ArrayList;
import java.util.Scanner;

import static class_4th.HW3.PubTrasp_HW3.sequence;

/**
 * HW4 : Class for testing PubTrasp and NewTicketPurchase
 * @author Jong In Baek (201918024)
 */

public class NewDealStationDemo {

    public static void main(String[] args) {
        ArrayList<NewTicketPurchase> list = new ArrayList<>();

        System.out.println(":: Welcome to New DealStation ::");

        NewTicketPurchase ntp = new NewTicketPurchase(); // NewTicketPurchase 마다 5개의 Ticket 가능.

        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many orders do you want to make?"); //order 개수 입력받음
        int numoforder = keyboard.nextInt();

        for(int i=0; i<numoforder; i++){ // Order 개수만큼 진행한다.
            list.add(new NewTicketPurchase()); //has each order
            System.out.println("This is your Order " + (i+1));
            System.out.println("How many tickets would you buy?");
            int noftic;

            while(true) {
                noftic = keyboard.nextInt(); //티켓숫자
                if(noftic > 5 || noftic < 1){
                    System.out.println("plz input 1 to 5");
                    continue;
                }
                break;
            }


            list.get(i).setNumTickets(noftic);

            int t_cnt = 0; //티켓 숫자 표시용.
            while(true){ //Order에서 티켓만큼 진행한다.

                System.out.println("(Order " + (i+1) + ") Provide the information of Ticket " + (t_cnt + 1));
                System.out.println();

                PubTrasp temp = new PubTrasp();
                keyboard.nextLine();
                System.out.println("Which ticket would you buy? Please select one of the followings :");
                System.out.println("(Adult | Student | Child)");
                String t_Fare = keyboard.nextLine();
                temp.setFare(t_Fare);

                System.out.println("What is your payment method? Please select one of the followings :");
                System.out.println("(Cash | Credit card | Affiliate card)");
                temp.setPayment_method(keyboard.nextLine());

                System.out.println("Where is your destination? Please select one of the followings :");
                System.out.println("(Zone 1 | Zone 2 | Zone 3 | Zone 4)");
                temp.setSelection(keyboard.nextLine());

                System.out.println("Which transportation do you prefer? Please select one of the followings :");
                if (temp.getSelection().equals("Zone 1") || temp.getSelection().equals("Zone 2")) {
                    System.out.println("(Regular | Private)");
                } else {
                    System.out.println("(Regular | Express)");
                }

                temp.setType(keyboard.nextLine());

                System.out.println("Ticket " + (t_cnt+1) + " : " + temp.describeTicketSpec());

                System.out.println("Is this correct? (y/n)");

                char correct = keyboard.next().charAt(0);
                if (correct == 'n') continue;

                    switch (t_cnt){
                        case 0 : list.get(i).setTicket1(temp);
                            break;
                        case 1 : list.get(i).setTicket2(temp);
                            break;
                        case 2 : list.get(i).setTicket3(temp);
                            break;
                        case 3 : list.get(i).setTicket4(temp);
                            break;
                        case 4 : list.get(i).setTicket5(temp);
                            break;
                    }
                System.out.println("Ticket " + (t_cnt+1) + " fare: " + temp.calculateTotalFare() + "KRW");
                System.out.println();

                t_cnt++;
                if(t_cnt >= noftic) {
                    System.out.println(list.get(i).toString());
                    System.out.println();
                    break;
                }
            }

        }

        System.out.println("Summary:");
        for(int i=0; i<numoforder; i++){
            System.out.println("Order" + (i+1) + " - total fare : " + list.get(i).calculateTotalFare() + "KRW" );
        }

    }
}
