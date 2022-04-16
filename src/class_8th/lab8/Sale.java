package class_8th.lab8;

public class Sale {
    private String name;
    private double price;

    public Sale() {
        name = "No name yet";
        price = 0;
    }

    public Sale(String theName, double thePrice) {
        setName(theName);
        setPrice(thePrice);
    }

    public Sale(Sale orgObj) {
        if (orgObj == null) System.out.println("null sale object");
        else {
            this.name = orgObj.name;
            this.price = orgObj.price;
        }
    }

    public static void announcement() {
        System.out.println("This is the Sale class.");
    }

    public String toString() {
        return (name + " Price and total cost = $" + price);
    }

    public double bill() {
        return price;
    }

    public boolean equalDeals(Sale otherSale) {
        if (otherSale == null) return false;
        boolean res = false;
        if (otherSale == null) return res;
        else res = (name.equals(otherSale.name) && this.bill() == otherSale.bill());

        return res;
    }

    public boolean lessThan(Sale otherSale) {
        if (otherSale == null) return false;
        boolean res = false;
        //Write the correct code.

        if (this.bill() < otherSale.bill()) res = true;

        return res;
    }

    public boolean equals(Object otherObject) {
        if (otherObject == null) return false;
        boolean res = false;
        //Write the correct code.
        if (this.name == ((Sale) otherObject).name && this.price == ((Sale) otherObject).price) res = true;

        return res;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
