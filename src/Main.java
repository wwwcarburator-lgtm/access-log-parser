import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0; // счетчик

        while (true) {
            System.out.print("Введите путь к файлу: ");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists(); // проверка существует ли файл
            boolean isDirectory = file.isDirectory(); // проверка на путь к папке

            if (!fileExists || isDirectory) {
                if (!fileExists) {
                    System.out.println("Файл не существует");
                } else {
                    System.out.println("Это путь к папке, а не к файлу");
                }
                continue;
            }

            count++;

            System.out.println("Путь указан верно");
            System.out.println("Это файл номер " + count);
        }
    }
}
