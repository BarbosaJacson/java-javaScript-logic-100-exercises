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
        int ultimo = 1;
        int penultimo = 0;
        int proximo = 0;
        for (int i = 1; i <= numero; i++) {
            System.out.print(ultimo + ",  ");

            proximo = penultimo + ultimo;
            penultimo = ultimo;
            ultimo = proximo;

        }
        scanner.close();
    }
}