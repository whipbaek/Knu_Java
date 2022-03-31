package class_5th.lab4;

public class TurnTaker {
    private static int turn = 0;

    private int myTurn;
    private String name;

    public TurnTaker (String theName, int theTurn){
        myTurn = theTurn;
        name = theName;
    }

    public TurnTaker() {
        name = null;
        myTurn = 0;
    }

    public String getName(){
        return name;
    }

    public static int getTurn(){
        return ++turn;
    }

    public boolean isMyTurn(){
        return turn == myTurn ? true : false;
    }

    public static void main(String[] args) {
        TurnTaker lover1 = new TurnTaker("Romeo", 2);
        TurnTaker lover2 = new TurnTaker("Juliet", 4);
        TurnTaker writer = new TurnTaker("Shakespeare", 7);

        for (int i = 1; i <= 7; i++) {
            System.out.println("Turn = " + TurnTaker.getTurn());
            if(lover1.isMyTurn())
                System.out.println("Love from " + lover1.getName());
            if(lover2.isMyTurn())
                System.out.println("Love from " + lover2.getName());
            if(writer.isMyTurn())
                System.out.println("Written by " + writer.getName());

        }

    }

}
