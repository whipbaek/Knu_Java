package class_8th.HW7;

public class Bus extends PubTrasp {

    public Bus() { //default constructor
        super();
    }

    public Bus(String fare, String section, String payment, String type, int total){
        super(fare,section,payment,type,total);
    }

    public Bus(Bus newbus){ //copy constructor
        super(newbus);
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
        return "(Adult | Student | Child)";
    }

    @Override
    public String getSectionList() {
        return "(Zone 1 | Zone 2)";
    }

    @Override
    public String getPaymentList() {
        return "(Cash | Credit card)";
    }

    @Override
    public String getTypeList() {
        return "(Regular | Express)";
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

        return new String("Total Fare: ₩" + sum);
    }

    @Override
    public String describePubTrasp() {
        return new String(
                "Bus, Basic fare : " + fare + ", Payment method : " + payment + ", "
         + " Section : " + section + ", Type : " + type +  "\n" + getTotalFareInfo());
    }

    public String toString(){
        return describePubTrasp();
    }
}
