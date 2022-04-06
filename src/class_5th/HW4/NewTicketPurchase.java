package class_5th.HW4;

public class NewTicketPurchase {

    private int NumTickets;
    private PubTrasp Ticket1;
    private PubTrasp Ticket2;
    private PubTrasp Ticket3;
    private PubTrasp Ticket4;
    private PubTrasp Ticket5;

    public NewTicketPurchase() {
    }

    public NewTicketPurchase(NewTicketPurchase ntp){
            NumTickets = ntp.getNumTickets();
            Ticket1 = new PubTrasp(ntp.getTicket1());
            Ticket2 = new PubTrasp(ntp.getTicket2());
            Ticket3 = new PubTrasp(ntp.getTicket3());
            Ticket4 = new PubTrasp(ntp.getTicket4());
            Ticket5 = new PubTrasp(ntp.getTicket5());
    }

    public int getNumTickets() {
        return NumTickets;
    }

    public void setNumTickets(int numTickets) {
        NumTickets = numTickets;
    }

    public PubTrasp getTicket1() {
        return Ticket1;
    }

    public void setTicket1(PubTrasp ticket1) {
        Ticket1 = ticket1;
    }

    public PubTrasp getTicket2() {
        return Ticket2;
    }

    public void setTicket2(PubTrasp ticket2) {
        Ticket2 = ticket2;
    }

    public PubTrasp getTicket3() {
        return Ticket3;
    }

    public void setTicket3(PubTrasp ticket3) {
        Ticket3 = ticket3;
    }

    public PubTrasp getTicket4() {
        return Ticket4;
    }

    public void setTicket4(PubTrasp ticket4) {
        Ticket4 = ticket4;
    }

    public PubTrasp getTicket5() {
        return Ticket5;
    }

    public void setTicket5(PubTrasp ticket5) {
        Ticket5 = ticket5;
    }

    public String toString(){
        String temp = new String();
        if(Ticket1 != null) temp += "Ticket 1 : " + Ticket1.describeTicketSpec() + "\n";
        if(Ticket2 != null) temp += "Ticket 2 : " + Ticket2.describeTicketSpec() + "\n";
        if(Ticket3 != null) temp += "Ticket 3 : " + Ticket3.describeTicketSpec() + "\n";
        if(Ticket4 != null) temp += "Ticket 4 : " + Ticket4.describeTicketSpec() + "\n";
        if(Ticket5 != null) temp += "Ticket 5 : " + Ticket5.describeTicketSpec() + "\n";
        temp += "Total : " + this.calculateTotalFare() + "KRW";

        return temp;
    }

    public double calculateTotalFare(){
        double total =0.0;
        if(Ticket1 != null) total +=Ticket1.calculateTotalFare();
        if(Ticket2 != null) total +=Ticket2.calculateTotalFare();
        if(Ticket3 != null) total +=Ticket3.calculateTotalFare();
        if(Ticket4 != null) total +=Ticket4.calculateTotalFare();
        if(Ticket5 != null) total +=Ticket5.calculateTotalFare();

        return total;
    }


}
