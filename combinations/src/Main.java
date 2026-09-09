import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Digite um número entre 2 e 12: ");
        if (!scanner.hasNextInt()) {
            System.out.print("Digite um número inteiro válido");
            scanner.close();
            return;
        }
        int numero = scanner.nextInt();
        if (numero < 2 || numero > 12) {
            System.out.println("Erro: Digite um número inteiro entre 2 e 12!");
            scanner.close();
            return;
        }
        int dadoA = 0;
        int dadoB = 0;

        for (int i = 1; i <= 6; i++) {
            dadoA = i;
            dadoB = numero - (i);
            if ((dadoA >= 1 && dadoA < 7) && (dadoB >= 1 && dadoB < 7)) {
                System.out.printf("%d %d%n", dadoA, dadoB);
            }
        }
        scanner.close();
    }
}