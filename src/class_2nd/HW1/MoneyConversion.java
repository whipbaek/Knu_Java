package class_2nd.HW1;

import java.util.Scanner;

/**
 * Title : HW#2 - MoneyConversion
 * StudentId : 2019118024
 * Department : School of Computer Science and Engineering
 * Name : Jong In Baek
 * @autohr yksuh
 */

public class MoneyConversion {

    public static void main(String[] args) {

        int money = 187;
        System.out.println("The input price : $" + money);

        int fifty = money/50;
        money -= fifty * 50;

        int twenty = money/20;
        money -= twenty * 20;

        int ten = money/10;
        money -= ten * 10;

        int five = money/5;
        money -= five * 5;

        System.out.println();
        System.out.println("The converted money is:");
        System.out.println(fifty + " fifty dollar bill(s), " + twenty + " twenty dollar bill(s), " + ten +
                " ten dollar bill(s), and " + five + " five dollar bill(s)");

    }

}
