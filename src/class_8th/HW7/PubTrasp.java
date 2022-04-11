package class_8th.HW7;

public abstract class PubTrasp {

    protected String fare;
    protected String section;
    protected String payment;
    protected String type;
    protected  int total;

    public PubTrasp(){}

    public PubTrasp(String fare, String section, String payment, String type, int total){
        this.fare = fare;
        this.section = section;
        this.payment = payment;
        this.type = type;
        this.total = total;
    }

    public PubTrasp(PubTrasp newPubTrasp){
        this.fare = newPubTrasp.fare;
        this.section = newPubTrasp.section;
        this.payment = newPubTrasp.payment;
        this.type = newPubTrasp.type;
        this.total = newPubTrasp.total;
    }


    public abstract void setFare(String fare);
    public abstract void setSection(String section);
    public abstract void setPayment(String payment);
    public abstract void setType(String type);

    public abstract String getFareList();
    public abstract String getSectionList();
    public abstract String getPaymentList();
    public abstract String getTypeList();
    public abstract String getTotalFareInfo();
    public abstract String describePubTrasp();

}
