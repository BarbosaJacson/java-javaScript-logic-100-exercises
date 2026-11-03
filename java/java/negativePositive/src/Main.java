import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.printf("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.printf("O número " + numero + " é positivo.");

        } else if (numero < 0) {
            System.out.printf("O número " + numero + " é negativo.");
        } else {

            System.out.printf("O número " + numero + " é neutro.");
        }
    }
}