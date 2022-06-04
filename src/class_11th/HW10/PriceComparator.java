package class_11th.HW10;

import java.util.Comparator;

public class PriceComparator implements Comparator<Ticket> {
    @Override
    public int compare(Ticket o1, Ticket o2) {
        if(o1.getPrice() < o2.getPrice()) return 1; //내림차순
        if(o1.getPrice() > o2.getPrice()) return -1;
        return 0;
    }
}
