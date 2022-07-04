import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        recurs(num);
    }

    public static void recurs(int num) {

        System.out.println(num);
        if (num != 1) {
            recurs(num - 1);
        }
    }

}
