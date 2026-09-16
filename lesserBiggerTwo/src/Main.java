import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;

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
        int posMaior = IntStream.range(0, vetor.length).filter(i ->vetor[i]==maior).findFirst().orElse(-1);
        int posMenor = IntStream.range(0, vetor.length).filter(i->vetor[i]==menor).findFirst().orElse(-1);


        System.out.print("Posição do maior: "+posMaior+", Maior: "+maior + ". Posição do menor: "+posMenor+", Menor: " + menor);
        scanner.close();
    }
}