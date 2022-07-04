import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        Random rand = new Random();
        int num;
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr.length; j++) {
                num = rand.nextInt(10);
                if (num % 2 == 0) {
                    arr[i][j] = num + 1;
                } else {
                    arr[i][j] = num;
                }
                System.out.print(arr[i][j] + " ");
            }
        }


    }
}
