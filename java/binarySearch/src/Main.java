import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        Random random = new Random();
        int tamanho = 10;
        int[] vetor = new int[tamanho];

        for (int i = 0; i < vetor.length; i++) {

            vetor[i] = random.nextInt(20) + 1;

        }
        Arrays.sort(vetor);
        System.out.println(Arrays.toString(vetor));
        System.out.println("Digite um número inteiro: ");
        if (!scanner.hasNextInt()) {
            System.out.print("ERRO!!Digite um número inteiro!!");
            scanner.close();
            return;
        }
        int numero = scanner.nextInt();

        String buscaBinaria = IntStream.of(Arrays.binarySearch(vetor, numero))
                .filter(pos -> pos >= 0)
                .mapToObj(pos -> "Número encontrado na posição: " + pos)
                .findFirst()
                .orElse("Valor não encontrado no vetor!");
        System.out.print(buscaBinaria);

        scanner.close();
    }
}