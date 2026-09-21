import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        Random random = new Random();

        int[] vetor = new int[100];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100) + 1;
        }
        System.out.println("Vetor gerado: " + Arrays.toString(vetor));
        System.out.print("Digite um número inteiro: ");

        if (!scanner.hasNextInt()) {
            System.out.print("ERROR!!Digite um número inteiro válido!!)");
            scanner.close();
            return;
        }
        int numeroBuscado = scanner.nextInt();

        long ocorrencias = Arrays.stream(vetor).filter(n -> n == numeroBuscado).count();
        System.out.println("O número " + numeroBuscado + " aparece " + ocorrencias + " vez(es) no vetor.");

        scanner.close();
    }
}