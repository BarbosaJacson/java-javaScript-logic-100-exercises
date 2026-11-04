import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print(("Digite um número inteiro: "));

        if (!scanner.hasNextInt()) {
            System.out.print("ERROR: Digite um número inteiro!! ");
            scanner.close();
            return;
        }
        int numero = scanner.nextInt();
        double denominador = 1;
        double euller = 1.0;

        for (int i = 1; i <= numero; i++) {
            denominador *= i;
            euller += (1 / denominador);
        }
        System.out.printf("O número de Euler para o termo %d é: %.2f%n", numero, euller);

        scanner.close();
    }

}