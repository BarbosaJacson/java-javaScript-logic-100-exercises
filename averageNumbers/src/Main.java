import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.printf("Quantos números irá digitar?");
        double qtde = scanner.nextDouble();
        int soma = 0;
        double media = 0;
        for (int i = 1; i <= qtde; i++) {
            System.out.printf("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            soma += numero;

        }
        media = soma / qtde;
        System.out.printf("Média: %.2f\n", media);
        scanner.close();

    }
}