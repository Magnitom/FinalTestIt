import java.io.*;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите путь к файлу");
        String file1 = sc.nextLine();
        System.out.println("Введите путь куда копировать");
        String copy  = sc.nextLine();
        try(InputStream is = new FileInputStream(file1); OutputStream os = new FileOutputStream(copy)) {
            while (is.available() != 0){
                os.write(is.read());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
