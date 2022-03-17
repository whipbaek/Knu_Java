package class_3rd;

/**
 * Break Point를 지정후에
 * stepinto 등의 동작으로 디버깅을 작동한다.
 */
public class Debugger {
    public static void main(String[] args) {
        int n = 10;
        int sum = 10;
        while (n > 1) {
            sum += n;
            n--;
        }
        System.out.println("total sum = " + sum);
        
    }
}
