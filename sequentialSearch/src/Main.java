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

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(20)+1;
        }
        System.out.println(Arrays.toString(vetor));

        System.out.print("Digite um número inteiro: ");
        if (!scanner.hasNextInt()) {
            System.out.print("ERROR!! Digite um número inteiro!!");
            scanner.close();
            return;
        }
        int numero = scanner.nextInt();

        int posicao = IntStream.range(0, vetor.length)
                .filter(i -> vetor[i] == numero)
                .findFirst()
                .orElse(-1);

        System.out.print(posicao);
        scanner.close();
    }

}