import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double populacaoA = 5000000;
        double populacaoB = 7000000;
        int contador = 0;

        while (populacaoA <= populacaoB) {
            populacaoA = populacaoA + (populacaoA * 0.03);
            populacaoB = populacaoB + (populacaoB * 0.02);
            contador++;
        }
        System.out.print("A população A supera a população B em aproximadamente  " + contador + " anos.");

        scanner.close();
    }
}