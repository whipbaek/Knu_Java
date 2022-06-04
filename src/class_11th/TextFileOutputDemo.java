package class_11th;

/***
 * You cannot release or distribute 
 * this code without instructor's permission.
 * COMP217: Java Programming
 * Instructor: Prof. Suh, Young-Kyoon
 * Class: TextFileOutputDemo
 * @author yksuh
 */
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class TextFileOutputDemo {

	public static void main(String[] args) {
		PrintWriter outputStream = null;
		try {
			String fileName = "stuff.txt";
			outputStream = 
					new PrintWriter(new FileOutputStream(fileName));
		}catch(FileNotFoundException e){
			System.out.println("Error opening the file stuff.txt");
			System.exit(0);
		}
		
		System.out.println("Writing to file.");
		
		outputStream.println("The quick brown fox");
		outputStream.println("jumps over the lazy dog.");
		outputStream.println("new thing");
		outputStream.close();
		
		System.out.println("End of program.");
	}
}
