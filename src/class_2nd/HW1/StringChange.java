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

    public void Convertname(String str, String ID) {

        int name = str.indexOf("name");

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str.substring(0,name));
        stringBuffer.append(ID);
        stringBuffer.append(str.substring(name+4, str.length()));

        System.out.println("After");
        System.out.println(stringBuffer);

    }

    public static void main(String[] args) {

        String lineOfText = "select name, code from course where course.name = 'Java Programming'";

        System.out.println("Before");
        System.out.println(lineOfText);

        StringChange stringChange = new StringChange();
        stringChange.Convertname(lineOfText, "id");
    }
}
