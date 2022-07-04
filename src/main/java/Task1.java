import java.lang.reflect.Array;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            Random rand = new Random();
            arr[i] = rand.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        int maxNumArr = arr[0];
        int minNumArr = arr[0];
        int avg = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNumArr) {
                maxNumArr = arr[i];
            }
            if (arr[i] < minNumArr) {
                minNumArr = arr[i];
            }
            if (i != 0) {
                avg += arr[i];
            }
        }
        System.out.println("\nMax = " + maxNumArr);
        System.out.println("Min = " + minNumArr);
        System.out.println("AVG = " + avg/arr.length);


    }
}
