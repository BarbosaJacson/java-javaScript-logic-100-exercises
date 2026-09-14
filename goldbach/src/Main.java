import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static boolean ehPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        for (int i = 500; i <= 1000; i += 2) {
            int numeroPar = i;

            for (int p1 = 2; p1 <= numeroPar / 2; p1++) {
                int p2 = numeroPar - p1;

                if (ehPrimo(p1) && ehPrimo(p2)) {
                    System.out.printf("%d = %d + %d%n", numeroPar, p1, p2);
                    break;
                }
            }
        }
        scanner.close();
    }
}