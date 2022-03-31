package class_5th.lab4;

import static java.lang.System.exit;


public class Date {
    private String month;
    private int day;
    private int year;

    private final String ERR_MSG = "Fatal Error.";

    public String getMonth() {
        return month;
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

    public Date() {
        this.month = "March";
        this.day = 24;
        this.year = 2022;

    }

    public Date(int nMonth, int nday, int nyear) {
        month = monthString(nMonth);
        day = nday;
        year = nyear;
    }

    public Date(Date aDate) {
        if (aDate == null) {
            System.out.println(ERR_MSG);
            exit(1);
        }

        this.month = aDate.month;
        this.day = aDate.day;
        this.year = aDate.year;

    }
    public String monthString(int monthNumber){
        String res = "";
        switch (monthNumber) {
            case 1:
                res = "January"; break;
            case 2:
                res = "February"; break;
            case 3:
                res = "March"; break;
            case 4:
                res = "April"; break;
            case 5:
                res = "May"; break;
            case 6:
                res = "June"; break;
            case 7:
                res = "July"; break;
            case 8:
                res = "August"; break;
            case 9:
                res = "September"; break;
            case 10:
                res = "October"; break;
            case 11:
                res = "November"; break;
            case 12:
                res = "December"; break;
            default:
                System.out.println("Fatal error");
        }
        return res;
    }


    public int monthString(String monthNumber){
        int res = -1;
        switch (monthNumber) {
            case "January":
                res = 1; break;
            case "February":
                res = 2; break;
            case "March":
                res = 3; break;
            case "April":
                res = 4; break;
            case "May":
                res = 5; break;
            case "June":
                res = 6; break;
            case "July":
                res = 7; break;
            case "August":
                res = 8; break;
            case "September":
                res = 9; break;
            case "October":
                res = 10; break;
            case "November":
                res = 11; break;
            case "December":
                res = 12; break;
            default:
                System.out.println("Fatal error");
        }
        return res;
    }

    public String toString() {
        return (month + " " + day + ", " + year);
    }

    public boolean equals(Date otherDate) {
        return (month.equals(otherDate.month)
                && day == otherDate.day
                && year == otherDate.year);
    }
}
