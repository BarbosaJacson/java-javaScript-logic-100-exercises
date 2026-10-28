import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("Digite um número inteiro: ");
        if (!scanner.hasNextInt()) {
            System.out.print("ERROR: Digite um número inteiro!!");
            scanner.close();
            return;
        }
        int numero = scanner.nextInt();
        double termo = 0;
        double impar = 0;
        for (int i = 1; i <= numero; i++) {
            impar = 2 * i - 1;
            double fracao = 1.0 / Math.pow(impar, 3);
            termo += (i % 2 != 0) ? fracao : -fracao;
        }
        System.out.printf("O valor de S é: %.2f%n", termo);
        scanner.close();
    }
}