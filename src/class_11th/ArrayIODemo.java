package class_11th;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/***
 * You cannot release or distribute 
 * this code without instructor's permission.
 * COMP217: Java Programming
 * Instructor: Prof. Suh, Young-Kyoon
 * Class: ArrayIODemo
 * @author yksuh
 */
public class ArrayIODemo {
	public static void main(String[] args) {
		SomeClass[] a = new SomeClass[2];
		a[0] = new SomeClass(10, 'X');
		a[1] = new SomeClass(20, 'Y');
		
		try {
			ObjectOutputStream outputStream = 
					new ObjectOutputStream(new FileOutputStream("arrayFile"));
			outputStream.writeObject(a);
			outputStream.close();
		}catch(IOException e) {
			System.err.println("Error writing to file.");
			System.exit(0);
		}
		System.out.println("Array written to file arrayfile.");
		
		System.out.println("Now let's open the file and display the array.");
		SomeClass[] b = null;
		try {
			ObjectInputStream inputStream = 
					new ObjectInputStream (new FileInputStream("arrayfile"));
			b = (SomeClass[])inputStream.readObject();
			
			inputStream.close();
		}catch(FileNotFoundException e) {
			System.err.println("Cannot find file arrayfile.");
			System.exit(0);
		}catch(ClassNotFoundException e) {
			System.err.println("Problems with file input.");
			System.exit(0);
		}catch(IOException e) {
			System.err.println("Problems with file input.");
			System.exit(0);
		}
		
		System.out.println("The following array elements were read from the file:");	
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println("End of program.");
	}
}
