package MidTerm_Exam;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            Manager manager = new Manager();

            System.out.println("::: Welcome to Deal Company :::");
            System.out.println();
            
            manager.loadData();
            
            boolean isQuit = true;
            int command;
            String name = "";
            String result = "";
        
            while(isQuit) {
            	System.out.println("1: print all data | 2: Find position | 3: Update worker status | 4: Find vacation | 5: Quit");
            	System.out.print("Enter the command: ");
            	command = keyboard.nextInt();
				System.out.println();
				
				switch(command) {
				case 1:
					manager.printAll();
					System.out.println();
					break;
				case 2:
					System.out.print("Enter name: ");
					name = keyboard.next();
					result = manager.findPosition(name);
					System.out.println(result);
					System.out.println();
					break;
				case 3:
					manager.updateTemporaryWorker();
					manager.writeWorkers();
					System.out.println();
					break;
				case 4:
					System.out.print("Enter name: ");
					name = keyboard.next();
					result = manager.findVacation(name);
					System.out.println(result);
					System.out.println();
					break;
				case 5:
					isQuit = false;
					
				}
            	
            }
           keyboard.close();
    }
}