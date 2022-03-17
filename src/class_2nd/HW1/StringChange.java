package class_2nd.HW1;

/**
 * Title : HW#1 - StringChange (Convert "name" to "id")
 * StudentId : 2019118024
 * Department : School of Computer Science and Engineering
 * Nane : Jong In Baek
 *
 * @autohr yksuh
 */

public class StringChange {


    public static void main(String[] args) {

        String lineOfText = "select name, code from course where course.name = 'Java Programming'";

        //print before
        System.out.println("Before");
        System.out.println(lineOfText);

        //logic
        int name = lineOfText.indexOf("name");

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(lineOfText.substring(0,name));
        stringBuffer.append("id");
        stringBuffer.append(lineOfText.substring(name+4));

        lineOfText = new String(stringBuffer);

        //print after
        System.out.println("After");
        System.out.println(lineOfText);


    }
}
