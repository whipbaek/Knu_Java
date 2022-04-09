package class_6th.lab5;
import java.util.Scanner;
public class GradeBook {
	private int numStudents;// Same as studentAverage.length.
	private int numQuizzes;	// Same as quizAverage.length.
	
	private int[][] grade; // numStudents rows 
						   // numQuizzes columns
	private double[] studentAvg;
	private double[] quizAvg;
	
	public GradeBook(int[][] a){
		if(a.length == 0 || a[0].length == 0){
			System.out.println("Empty Grade records. Aborting.");
			System.exit(0);
		}
		numStudents = a.length; //행
		numQuizzes = a[0].length; //열
		fillGrade(a);
		fillStudentAverage();
		fillQuizAverage();
	}
	
	public GradeBook(GradeBook book){ // copy constructor
		numStudents = book.numStudents;
		numQuizzes = book.numQuizzes;
		fillGrade(book.grade);
		fillStudentAverage();
		fillQuizAverage();
	}
	
	public GradeBook(){// no-argument constructor
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter number of students");
		numStudents = keyboard.nextInt();
		
		System.out.println("Enter number of quizzes");
		numQuizzes = keyboard.nextInt();
		
		grade = new int[numStudents][numQuizzes];
		for(int studNum = 1; studNum <= numStudents; studNum++)
			for(int quizNum = 1; quizNum <= numQuizzes;quizNum++){
				System.out.println("Enter score for student number " + studNum);
				System.out.println("on quiz number " + quizNum);
				grade[studNum-1][quizNum-1] = keyboard.nextInt();
			}		
		fillStudentAverage();
		fillQuizAverage();
		keyboard.close();
	}
	
	// copy a into grade
	private void fillGrade(int[][] a){
		// Complete this body.
		for (int i = 0; i < numStudents; i++) {
			for(int j=0; j<numQuizzes; j++)
				grade[i][j] = a[i][j];
		}
	}
	
	// fills the array studentAverage using the data from the array grade
	private void fillStudentAverage(){
		studentAvg = new double[numStudents];
		double sum;

		for (int i = 0; i < numStudents; i++) {
			sum = 0;
			for(int j=0; j<numQuizzes; j++) sum += grade[i][j];

			sum /= numQuizzes;
			studentAvg[i] = sum;
		}
	}
	
	// fills the array quizAvg using the data from the array grade.
	private void fillQuizAverage(){
		quizAvg = new double[numQuizzes];

		double sum;

		for (int i = 0; i < numQuizzes; i++) {
			sum = 0;
			for(int j=0; j<numStudents; j++) {
				sum += grade[j][i];
			}
			sum /= numStudents;
			quizAvg[i] = sum;
		}
	}
	public void display(){
		for(int sNum=1; sNum<=numStudents;sNum++){
			// display for one studNum
			System.out.println("Student " + sNum + " Quizzes: ");
			for(int qNum=1;qNum<=numQuizzes;qNum++)
				System.out.println(grade[sNum-1][qNum-1] + " ");
			System.out.println(" Avg = " + studentAvg[sNum-1]);
		}
		
		System.out.println("Quiz averages: ");
		for(int qNum=1;qNum<=numQuizzes;qNum++)
			System.out.println("Quiz " + qNum + " Avg = " + quizAvg[qNum-1] + " ");
		System.out.println();
	}
}
