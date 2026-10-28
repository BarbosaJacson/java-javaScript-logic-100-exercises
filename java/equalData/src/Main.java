import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int[] vetor = new int[15];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            if (!scanner.hasNextInt()) {
                System.out.print("ERROR!! Digite um númento inteiro válido!!");
                scanner.close();
                return;
            }
            vetor[i] = scanner.nextInt();
        }
        System.out.print("Digite um númento inteiro contido no vetor: ");
        if (!scanner.hasNextInt()) {
            System.out.print("ERROR!! Digite um númento inteiro válido!!");
            scanner.close();
            return;
        }
        int numero = scanner.nextInt();

        long repeticoes = Arrays.stream(vetor)
                .filter(n -> n == numero)
                .count();
        System.out.println("O número  " + numero + " aparece " + repeticoes + " vezes.");

        scanner.close();
    }
}