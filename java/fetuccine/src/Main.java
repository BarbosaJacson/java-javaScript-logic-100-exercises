import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Digite o primeiro número da série: ");
        if (!scanner.hasNextInt()) {
            System.out.print("Digite um número inteiro válido!!");
            scanner.close();
            return;
        }
        int primeiro = scanner.nextInt();

        System.out.print("Digite o segundo número da série: ");
        if (!scanner.hasNextInt()) {
            System.out.print("Digite um número inteiro válido!!");
            scanner.close();
            return;
        }
        int segundo = scanner.nextInt();

        System.out.print("Digite a quantidade de números da série(minimo 3): ");
        if (!scanner.hasNextInt()) {
            System.out.print("Digite um número inteiro válido!!");
            scanner.close();
            return;
        }
        int qtde = scanner.nextInt();
        if (qtde < 3) {
            System.out.print("Erro: A quantidade de termos deve ser no mínimo 3!");
            scanner.close();
            return;
        }
        System.out.print(primeiro + " " + segundo + " ");
        int proximo = 0;
        for (int i = 3; i <= qtde; i++) {
            if (i % 2 == 0) {
                proximo = segundo - primeiro;
            } else {

                proximo = segundo + primeiro;
            }
            System.out.print(proximo + " ");
            primeiro = segundo;
            segundo = proximo;

        }

scanner.close();
    }
}