package class_6th.lab6;
import java.util.ArrayList;
import java.util.Scanner;

public class GolfScore {

	public static void main(String[] args) {
		ArrayList<Double> score = new ArrayList<Double>();

		System.out.println("This program reads golf scores and shows");
		System.out.println("how much each differs from the average.");
		
		System.out.println("Enter golf scores: ");
		fillArrayList(score);
		showDifference(score);
	}
	
	private static void fillArrayList(ArrayList<Double> score) {
		//음수이면 추가 멈춤
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter a list of nonnegative numbers.");
		System.out.println("Mark the end of list with a negative number");

		// fill out this code.
		while(true) {
			double temp = keyboard.nextDouble();
			if (temp < 0) break;
			score.add(temp);
		}
		keyboard.close();
	}
	
	private static void showDifference(ArrayList<Double> score) {

		double average = computeAverage(score);
		System.out.println("Average of the " + score.size()
				+ " scores = " + average);

		System.out.println("The scores are:");

		for(int i=0; i<score.size(); i++)
			System.out.println(score.get(i) + " differs from average by " + (score.get(i) - average));
		
	}
	
	private static double computeAverage(ArrayList<Double> score) {
		//평균값 구하기, 비어있으면 0 리턴
		double avg = 0;

		if(score == null){
			System.out.println("ERROR: Trying to average 0 numbers");
			return 0;
		}

		for(double v : score) avg += v;
		avg = avg/score.size();

		return avg;
	}
}
