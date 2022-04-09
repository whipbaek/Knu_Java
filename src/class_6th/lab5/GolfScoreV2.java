package class_6th.lab5;

import java.util.Scanner;

public class GolfScoreV2 {

	public static final int MAX_NUMBER_SCORES = 10;
	
	// shows the differences between each of a list of golf scores 
	// and their average
	public static void main(String[] args) {
		PartiallyFilledArray score =
				new PartiallyFilledArray(MAX_NUMBER_SCORES);
		System.out.println("This program reads golf scores and shows");
		System.out.println("how much each differs from the average.");
		
		System.out.println("Enter golf scores: ");
		fillArray(score);
		showDifference(score);
	}
	
	// reads values into the PartiallyFilledArray a.
	public static void fillArray(PartiallyFilledArray a) {
		System.out.println("Enter up to " + a.getMaxCapacity() 
			+ " nonnegative numbers, one per line.");
		System.out.println("Mark the end of the list with a negative number");
		Scanner keyboard = new Scanner(System.in);
		
		// fill out this code.
		while(true) {
			double temp = keyboard.nextDouble();
			if (a.getMaxCapacity() == a.getNumberOfElements() || temp < 0) break;
			a.add(temp);
		}
		keyboard.close();
	}
	
	public static void showDifference(PartiallyFilledArray a) {
		double average = computeAverage(a);
		System.out.println("Average of the " + a.getNumberOfElements() 
		+ " scores = " + average);
		
		System.out.println("The scores are:");

		for(int i=0; i<a.getNumberOfElements(); i++)
			System.out.println(a.getA()[i] + " differs from average by " + (a.getA()[i] - average));

	}
	
	public static double computeAverage(PartiallyFilledArray a) {
		double avg = 0;
		double sum=0.0;

		if(a.getA() == null){
			System.out.println("ERROR: Trying to average 0 numbers");
			return 0;
		}

		for(double v : a.getA()) sum += v;
		avg = sum/a.getNumberOfElements();
		
		return avg;
	}
}
