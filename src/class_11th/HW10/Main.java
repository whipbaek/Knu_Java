package class_11th.HW10;

import java.io.*;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		String destinationFile = "TicketData.txt";
		String fileToMerge = "TicketData2.txt";
		String binaryFile = "object.dat";

		ObjectManager om = new ObjectManager(destinationFile, fileToMerge);
		om.fileIOAndObjectSerialization(destinationFile, binaryFile);


	}
}





