import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean done = true;
        do {
            System.out.println("Введите слово начинающееся на букву А");
            String wordA = sc.nextLine();
            if (wordA.startsWith("А")) {
                done = false;
            }
        } while (done);
        System.out.println("Спасибо, вы справились!");
    }
}

