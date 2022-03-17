package class_3rd;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class File_Input_Demo {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream(new File("C:\\Users\\jibae\\Java_Programming\\src\\class_3rd\\player.txt"));

        int read = 0;
        while ((read = in.read()) != -1) {
            System.out.print((char)read);
        }

        in.close();

    }
}
