import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.printf("Quantos numeros irá digitar?");
        int qtde = scanner.nextInt();
        int[] numeros = new int[qtde];
        int maior = 0;
        for (int i = 0; i < qtde; i++) {

            System.out.printf("Digite um número: ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] > maior) {
                maior = numeros[i];
            }

        }
        System.out.println("O número maior é " + maior);
        scanner.close();
    }
}