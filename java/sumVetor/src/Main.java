import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int[] vetorUm = new int[10];
        int[] vetorDois = new int[10];

        for (int i = 0; i < vetorUm.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            if (!scanner.hasNextInt()) {
                System.out.print("ERROR!! Digite um número inteiro!!");
                scanner.close();
                return;
            }
            vetorUm[i] = scanner.nextInt();
        }
        for (int i = 0; i < vetorDois.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            if (!scanner.hasNextInt()) {
                System.out.print("ERROR!! Digite um número inteiro!!");
                scanner.close();
                return;
            }
            vetorDois[i] = scanner.nextInt();
        }
        int [] vetorSoma = IntStream.range(0, vetorUm.length).map(i -> Math.max(vetorUm[i], vetorDois[i])).toArray();
        System.out.print(Arrays.toString(vetorSoma));
        scanner.close();
    }
}