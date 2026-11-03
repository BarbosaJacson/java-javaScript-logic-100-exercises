import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int numero = 0;
        int maior = 0;
        int segundoMaior = 0;
        System.out.printf("Quantos números irá verificar?");
        int qtde = scanner.nextInt();

        for (int i = 1; i <= qtde; i++) {

            System.out.println("Digite o " + i + "º " + "número");
            numero = scanner.nextInt();
            if (numero > maior) {
                segundoMaior = maior;
                maior = numero;
            } else if (numero > segundoMaior) {
                segundoMaior = numero;
            }

        }
        int soma = maior + segundoMaior;
        System.out.println("O maior número é " + maior);
        System.out.println("O segundo maior é " + segundoMaior);
        System.out.println("A soma dos dois maiores é: " + soma);

    }
}