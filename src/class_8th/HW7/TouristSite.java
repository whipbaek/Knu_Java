package class_8th.HW7;

public class TouristSite implements Travel{
    private int price;
    private String type;

    public TouristSite() {
    }

    public TouristSite(String type) {
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
        System.out.println("museum | theme park | zoo");
    }

    public void setType(String type) {
        this.type = type;
    }

    public void CalcPrice(){
        switch (this.type){
            case "museum" : price = 10000; break;
            case "theme park" : price = 80000; break;
            case "zoo" : price = 12000; break;
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
