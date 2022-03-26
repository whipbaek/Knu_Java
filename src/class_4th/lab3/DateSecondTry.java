package class_4th.lab3;

import java.util.Scanner;

/**
 * Lab #3-1 : Design and write two simple classes
 */
public class DateSecondTry {
    private String month;
    private int day;
    private int year;
    public void wirteOutput() {
        System.out.println(month + " " + day + " " + year);
    }

    public void readInput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter month, day, and year");
        System.out.println("Do not use a comma.");

        this.month = sc.next();
        this.day = sc.nextInt();
        this.year = sc.nextInt();
    }

    void setDate(int nMonth, int nDay, int nYear) {

    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth(){

        switch (this.month) {
            case "January" : return 1;
            case "February" : return 2;
            case "March" : return 3;
            case "April" : return 4;
            case "May" : return 5;
            case "June" : return 6;
            case "July" : return 7;
            case "August" : return 8;
            case "September" : return 9;
            case "October" : return 10;
            case "November" : return 11;
            case "December" : return 12;
            default: {
                System.out.println("Fatal Error");
                return -1;
            }
        }
    }
}
