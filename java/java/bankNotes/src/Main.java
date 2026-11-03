import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int[] notas = {100, 50, 20, 10, 5, 2, 1};

        System.out.printf("Digite o valor do saque:  ");
        int saque = scanner.nextInt();
        int qtdeNotas = 0;

        for (int i = 0; i < notas.length; i++) {

            qtdeNotas = (saque / notas[i]);
            saque = saque % notas[i];

            if (qtdeNotas > 0) {
                System.out.printf("%d nota(s) de R$ %d,00\n", qtdeNotas, notas[i]);
            }
        }
        scanner.close();
    }
}
