package class_8th.HW7;

public class Taxi extends PubTrasp {

    private int distance;


    public Taxi() { //default constructor
        super();
    }

    public Taxi(String fare, String section, String payment, String type, int total, int distance){
        super(fare,section,payment,type,total);
        this.distance = distance;
    }

    public Taxi(Taxi newTaxi){ //copy constructor
        super(newTaxi);
        this.distance = newTaxi.distance;
    }

    public String getDistanceList() {
        return "(10 | 20 | 30 | 40)";
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public void setFare(String fare) {
        this.fare = fare;
    }

    @Override
    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public void setPayment(String payment) {
        this.payment = payment;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getFareList() {
        return "(Basic | Premium)";
    }

    @Override
    public String getSectionList() {
        return "(Zone 1 | Zone 2 | Zone 3 | Zone 4)";
    }

    @Override
    public String getPaymentList() {
        return "(Cash | Credit card)";
    }

    @Override
    public String getTypeList() {
        return "(Regular | Deluxe)";
    }

    @Override
    public String getTotalFareInfo() {
        int sum = 0;
        switch (fare){
            case "Adult" : sum+=1250; break;
            case "Student" : sum+=720; break;
            case "Child" : sum+=450; break;
            case "Basic" : sum+=2000; break;
            case "Premium" : sum+=4000; break;
        }

        switch (section){
            case "Zone 1" : sum+=200; break;
            case "Zone 2" : sum+=400; break;
            case "Zone 3" : sum+=600; break;
            case "Zone 4" : sum+=800; break;
        }

        switch (payment){
            case "Cash" : sum+=0; break;
            case "Credit card" : sum-=100; break;
        }

        switch (type){
            case "Regular" : sum+=0; break;
            case "Express" : sum+=800; break;
            case "Private" : sum+=1000; break;
            case "Deluxe" : sum+=20000; break;
        }

        sum += distance*1000;

        return new String("Total Fare: ₩" + sum);
    }

    @Override
    public String describePubTrasp() {
        return new String(
                "Taxi, Basic fare : " + fare + ", Payment method : " + payment + ", "
                        + " Section : " + section + ", Type : " + type + ", Distance : " + distance + "\n"  + getTotalFareInfo());
    }

    public String toString(){
        return describePubTrasp();
    }
}
