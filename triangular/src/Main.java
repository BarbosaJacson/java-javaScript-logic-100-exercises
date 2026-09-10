import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Digite um número inteiro: ");
        if (!scanner.hasNextInt()) {
            System.out.print("ERROR: Digite um número inteiro maior que zero.");
            scanner.close();
            return;
        }
        int numero = scanner.nextInt();
        int i = 1;
        int produto = 0;

        while (i * (i + 1) * (i + 2) < numero) {
            i++;
        }
        produto = i * (i + 1) * (i + 2);

        if (produto == numero) {
            System.out.print("O número " + numero + " é triangular (" + i + " x " + (i + 1) + " x " + (i + 2) + ")");
        } else {
            System.out.print("O número " + numero + " NÃO é triangular.");
        }
        scanner.close();

    }
}