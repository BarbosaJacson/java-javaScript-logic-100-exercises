import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Digite um número inteiro: ");

        if (!scanner.hasNextInt()) {
            System.out.print("ERROR: Digite um número inteiro válido!!");
            scanner.close();
            return;
        }
        int numero = scanner.nextInt();
        int sumDivisor = 0;

        for (int i = 1; i < numero; i++) {

            if (numero % i == 0) {
                sumDivisor += i;
            }
        }

        if (numero == sumDivisor) {
            System.out.print("O número " + numero + " é perfeito.");
        } else {
            System.out.print("O número " + numero + " não é perfeito.");
        }
        scanner.close();
    }
}
