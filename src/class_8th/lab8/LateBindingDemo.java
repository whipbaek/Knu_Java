package class_8th.lab8;

public class LateBindingDemo {
    public static void main(String[] args) {
        String floorMat = "floor mat";
        String cupHolder = "cup holder";

        Sale simple = new Sale(floorMat, 10.00);
        DiscountSale discount = new DiscountSale(floorMat, 11.00, 10);
        System.out.println(simple);
        System.out.println(discount);

        if (discount.lessThan(simple)) {
            System.out.println("Discounted item is cheaper");
        } else{
            System.out.println("Discounted item is not cheaper");
        }

        Sale regularPrice = new Sale(cupHolder, 9.90);
        DiscountSale specialPrice = new DiscountSale(cupHolder, 11.00, 10);
        System.out.println(regularPrice);
        System.out.println(specialPrice);

        if (specialPrice.equalDeals(regularPrice)) {
            System.out.println("Deals are equal.");
        } else{
            System.out.println("Deals are not equal.");
        }
    }
}
