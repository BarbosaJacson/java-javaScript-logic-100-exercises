import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.printf("Digite um número entre 1 e 7: ");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1 -> System.out.println("O dia é Domingo.");
            case 2 -> System.out.println("O dia é Segunda.");
            case 3 -> System.out.println("O dia é Terça.");
            case 4 -> System.out.println("O dia é Quarta.");
            case 5 -> System.out.println("O dia é Quinta.");
            case 6 -> System.out.println("O dia é Sexta.");
            case 7 -> System.out.println("O dia é Sábado.");
            default -> System.out.println("ERROR: Digite um número válido entre 1 e 7.");
        }
        scanner.close();
    }
}