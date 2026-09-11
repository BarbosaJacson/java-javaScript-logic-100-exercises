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
        double resultado = 0.0;
        for (int i = 1; i <= numero; i++) {
            resultado += 1 / Math.pow(i, i);
        }
        System.out.printf("O valor de S é: %.2f%n", resultado);

        scanner.close();
    }
}