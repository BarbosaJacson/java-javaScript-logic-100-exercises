import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double[] vetorUm = new double[10];
        double[] vetorDois = new double[10];
        double[] vetorSoma = new double[10];

        for (int i = 0; i < (vetorUm.length); i++) {
            System.out.print("Digite o " + (i + 1) + "º número do vetor nº 1: ");
            if (!scanner.hasNextDouble()) {
                System.out.print("ERROR! Digite um número inteiro!!!");
                scanner.close();
                return;
            }
            vetorUm[i] = scanner.nextDouble();
            System.out.print("Digite o " + (i + 1) + "º número do vetor nº 2: ");
            if (!scanner.hasNextDouble()) {
                System.out.print("ERROR! Digite um número inteiro!!!");
                scanner.close();
                return;
            }
            vetorDois[i] = scanner.nextDouble();
            vetorSoma[i] = vetorUm[i] + vetorDois[i];
        }
        System.out.println(Arrays.toString(vetorSoma));
        scanner.close();
    }
}