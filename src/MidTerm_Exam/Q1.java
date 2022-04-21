package MidTerm_Exam;
import java.util.Scanner;
import java.util.Random;

public class Q1 {
	public static int ranNum=0;
	public static String input;
	public static int winCnt = 0;
	public static int losecnt =0;
	
	public static void main(String[] args) {
		System.out.println("-------- Odd/Even Number Game --------");
		Scanner keyboard = new Scanner(System.in);

		// Implement your code.

		for(int i=0; i<5; i++) {
			boolean correct=false;

			ranNum = (int) (Math.random() * 100 + 1);
			System.out.print("Enter 'odd' or 'even' : ");
			input = keyboard.next();

			System.out.println("A random number : " + ranNum + ", your input : '" + input+"'");

			if(ranNum%2 == 1){ //홀수일때
				if(input.equals("odd")) correct = true;
				else correct = false;
			} else{
				if(input.equals("even")) correct = true;
				else correct = false;
			}


			if(correct) {
				System.out.println("Correct!");
				winCnt +=1;
			}
			else{
				System.out.println("Wrong");
				losecnt += 1;
			}

			System.out.println("Correct vs Wrong : " + winCnt + " vs " + losecnt);

			if(winCnt >= 3 || losecnt >= 3) break;

		}
		if(winCnt >= 3) System.out.println("----- You WON :) -----");
		else if(losecnt >=3) System.out.println("----- You Lose :( -----");
		System.out.println("----- Exit -----");
		
		keyboard.close();
	}
}
