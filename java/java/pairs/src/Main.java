import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {

                System.out.printf(String.valueOf(i+ ", "));
            }
        }
        scanner.close();
    }
}