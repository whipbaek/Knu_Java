package class_6th.HW5;

import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryDB {
    public static void main(String[] args) {

        Dictionary dictionary = new Dictionary();

        while(true){
            System.out.println("<Synonym Dictionary>");
            System.out.println("1. Add a term");
            System.out.println("2. Search for a term");
            System.out.println("3. Delete a term");
            System.out.println("4. Display all");
            System.out.println("5. Quit");

            String str = "";
            int idx;
            Scanner sc = new Scanner(System.in);
            idx = sc.nextInt();
            sc.nextLine();

            if(idx == 1 || idx == 2 || idx == 3){
                System.out.print("Please enter a term : ");
                str = sc.nextLine();
            }

            switch (idx){
                case 1 :
                    dictionary.AddTerm(str);
                    break;
                case 2 :
                    dictionary.SearchTerm(str);
                    break;
                case 3 :
                    dictionary.DeleteTerm(str);
                    break;
                case 4 :
                    dictionary.DisplayAll();
                    break;
                case 5 :
                    System.out.println("Bye!");
                    return ;
            }
        }
    }
}
