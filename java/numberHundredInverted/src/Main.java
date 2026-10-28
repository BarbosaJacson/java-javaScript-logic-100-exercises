import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        for (int i = 100; i >= 1; i--) {
            int numero = i;
            System.out.printf(i + ", ");

        }
        scanner.close();
    }
}