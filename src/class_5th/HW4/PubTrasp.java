package class_5th.HW4;

public class PubTrasp {
    private String Fare;
    private String Selection;
    private String Payment_method;
    private String Type;

    public PubTrasp(PubTrasp Ticket) {
        Fare = new String(Ticket.getFare());
        Selection = new String(Ticket.getSelection());
        Payment_method = new String(Ticket.getPayment_method());
        Type = new String(Ticket.getType());

    }

    public PubTrasp() {

    }

    public double calculateTotalFare() {
        double Total=0;

        switch (Fare) {
            case "Adult":
                Total += 1250;
                break;
            case "Student":
                Total += 720;
                break;
            case "Child":
                Total += 450;
                break;
        }

        switch (Payment_method){
            case "Credit card" :
                Total -=100;
                break;
            case "Affiliate card":
                Total -= 200;
                break;
        }

        switch (Selection) {
            case "Zone 1" :
                Total += 200;
                break;
            case "Zone 2" :
                Total += 400;
                break;
            case "Zone 3" :
                Total += 600;
                break;
            case "Zone 4" :
                Total += 800;
                break;
        }

        switch (Type){
            case "Express" :
                Total += 1000;
                break;
            case "Private" :
                Total += 800;
                break;
        }

        return Total;
    }

    public String describeTicketSpec(){
        String Summary = new String(Fare + ", " + Payment_method + ", "
                + Selection + ", " + Type + ", " + calculateTotalFare() + " KRW");

        return Summary;
    }

    public String getFare() {
        return Fare;
    }

    public void setFare(String fare) {
        Fare = fare;
    }

    public String getSelection() {
        return Selection;
    }

    public void setSelection(String selection) {
        Selection = selection;
    }

    public String getPayment_method() {
        return Payment_method;
    }

    public void setPayment_method(String payment_method) {
        Payment_method = payment_method;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }



}
