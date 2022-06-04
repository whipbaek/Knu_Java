package class_11th.HW10;

import java.io.Serializable;

public class Ticket implements Serializable {
    private String name;
    private String type;
    private String fare;
    private String payment;
    private int price;
    private int numOfTicket;

    public Ticket(String name, String type, String fare, String payment, int price, int numOfTicket) {
        this.name = name;
        this.type = type;
        this.fare = fare;
        this.payment = payment;
        this.price = price;
        this.numOfTicket = numOfTicket;
    }

    @Override
    public String toString() {
        return ("Name : " + name + '\n' +
                "Type : " + type + '\n' +
                "Fare : " + fare + '\n' +
                "Payment : " + payment + '\n' +
                "Price : " + price + '\n' +
                "Number of Ticket : " + numOfTicket);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumOfTicket() {
        return numOfTicket;
    }

    public void setNumOfTicket(int numOfTicket) {
        this.numOfTicket = numOfTicket;
    }
}
