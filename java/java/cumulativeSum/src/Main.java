import java.io.Console;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma = soma + i;
        System.out.println(i +", "+ soma);
        }
        scanner.close();
    }
}