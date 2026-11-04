import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.printf("Digite um número: ");
        int numero = scanner.nextInt();
        int modulo = Math.abs(numero);
        System.out.printf("O modulo é "+ modulo);

        scanner.close();

    }
}