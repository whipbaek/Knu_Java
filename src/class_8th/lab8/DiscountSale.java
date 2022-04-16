package class_8th.lab8;

public class DiscountSale extends Sale {
    private double discount;

    public static void announcement() {
        System.out.println("This is the DiscountSale class");
    }

    @Override
    public double bill() {
        return super.bill() - (super.bill() * discount / 100);
    }

    public DiscountSale() {
        super();
    }

    public DiscountSale(String theName, double thePrice) {
        super(theName, thePrice);
    }

    public DiscountSale(DiscountSale orgObj) {
        super(orgObj);
    }

    public DiscountSale(String theName, double thePrice, double theDiscount) {
        super(theName, thePrice);
        this.discount = theDiscount;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject == null) return false;

        if (this.getName() == ((DiscountSale) otherObject).getName() &&
            this.getPrice() == ((DiscountSale) otherObject).getPrice() &&
            this.getDiscount() == ((DiscountSale) otherObject).getDiscount()) return true;

        return false;
    }

    @Override
    public String toString() {
        return (this.getName() + " Price  = $" + this.getPrice()) + " Discount = " + this.discount + "% Total cost = $" + this.bill();
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
