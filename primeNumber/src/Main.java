import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Digite um número qualquer: ");
        int numero = scanner.nextInt();
        boolean ehPrimo = true;
        if (numero <= 1) {
            ehPrimo = false;
        }
        for (int i = 2; i <= (numero - 1); i++) {
            if (numero % i == 0) {
                ehPrimo = false;
                break;
            }
        }
        if (ehPrimo) {
            System.out.print("O número é primo.");
        } else {
            System.out.print("O número não é primo.");
        }
        scanner.close();
    }
}