package class_8th.HW7;

public class Accommodation implements Travel{
    private int price;
    private String type;

    public Accommodation() {
    }

    public Accommodation(String type) {
        this.type = type;
        CalcPrice();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void getType() {
        System.out.println("hotel | guest house | pension");
    }

    public void setType(String type) {
        this.type = type;
    }

    public void CalcPrice(){
        switch (type){
            case "hotel" : price = 100000; break;
            case "guest house" : price = 40000; break;
            case "pension" : price = 150000; break;
        }
    }

    @Override
    public void printType() {
        System.out.println("Type : " + type);
    }

    @Override
    public void printPrice() {
        System.out.println("Price : ₩" + price + '.');
    }
}
