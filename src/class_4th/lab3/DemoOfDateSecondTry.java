package class_4th.lab3;

public class DemoOfDateSecondTry {
    public static void main(String[] args) {
        int dayNumber;

        DateSecondTry dateSecondTry = new DateSecondTry();
        dateSecondTry.readInput();
        dayNumber = dateSecondTry.getDay();
        switch (dayNumber){
            case 1 :
                System.out.println("That is the " + dayNumber + " st day of the month");
                break;
            case 2 :
                System.out.println("That is the " + dayNumber + " nd day of the month");
                break;
            case 3 :
                System.out.println("That is the " + dayNumber + " rd day of the month");
                break;
            default:
                System.out.println("That is the " + dayNumber + " th day of the month");
        }
    }
}
