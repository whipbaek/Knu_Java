package class_3rd.HW2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringChangeV2 {

    public static void main(String[] args) {

        Scanner sc;
        int cnt = 0;
        {
            try {
                sc = new Scanner(new FileInputStream("./memo.txt"));
                while (sc.hasNextLine()) {
                    //change id to name
                    String temp = sc.nextLine();
                    int id = temp.indexOf("id");
                    while(id!=-1){
                        cnt++;
                        if(cnt==2 || cnt ==4){

                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append(temp.substring(0,id));
                            stringBuffer.append("name");
                            stringBuffer.append(temp.substring(id+2));

                            temp = new String(stringBuffer);

                        }
                        id = temp.indexOf("id",id+2);
                    }

                    System.out.println(temp);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
