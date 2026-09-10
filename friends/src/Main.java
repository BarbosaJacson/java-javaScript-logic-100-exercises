import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Digite o primeiro número inteiro: ");
        if (!scanner.hasNextInt()) {
            System.out.print(("ERROR!! Digite um número inteiro válido!!"));
            scanner.close();
            return;
        }
        int amigoA = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        if (!scanner.hasNextInt()) {
            System.out.print(("ERROR!! Digite um número inteiro válido!!"));
            scanner.close();
            return;
        }
        int amigoB = scanner.nextInt();

        int divisorA = 0;
        int divisorB = 0;

        for (int i = 1; i < amigoA; i++) {
            if (amigoA % i == 0) {

                divisorA = divisorA + i;
            }
        }

        for (int j = 1; j < amigoB; j++) {
            if (amigoB % j == 0) {

                divisorB = divisorB + j;
            }
        }
        if (divisorA == amigoB && divisorB == amigoA) {

            System.out.print("Os números  " + amigoA + " e " + amigoB + " são amigos.");
        } else {
            System.out.print("Os números  " + amigoA + " e " + amigoB + " não são amigos.");
        }
        scanner.close();
    }
}
