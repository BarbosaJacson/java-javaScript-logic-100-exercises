import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int[] vetor = new int[20];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o "+(i+1)+"º número inteiro: ");
            if (!scanner.hasNextInt()) {
                System.out.print("ERROR! Digite um número inteiro!");
                scanner.close();
                return;
            }
            vetor[i] = scanner.nextInt();

        }
        int maior = Arrays.stream(vetor).max().getAsInt();
        int menor = Arrays.stream(vetor).min().getAsInt();
        System.out.print(maior + ", " + menor);
        scanner.close();
    }
}