import java.sql.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int[] vetor = new int[10];
        int[] vetorCopia = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            if (!scanner.hasNextInt()) {
                System.out.print("ERROR!! Digite um número inteiro!!");
                scanner.close();
                return;
            }
            vetor[i] = scanner.nextInt();
        }
        vetorCopia = vetor.clone();
        System.out.print(Arrays.toString(vetorCopia));
        scanner.close();

    }
}