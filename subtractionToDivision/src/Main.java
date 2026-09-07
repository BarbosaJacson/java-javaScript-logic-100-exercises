import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int divisor = 0;
        int numerador = 0;
        int resto = 0;

        System.out.print("Digite um número inteiro: ");

        if (!scanner.hasNextInt()) {
            System.out.print("Digite um número inteiro válido");
            scanner.close();
            return;
        }
        numerador = scanner.nextInt();

        System.out.print("Digite um número inteiro: ");

        if (!scanner.hasNextInt()) {
            System.out.print("Digite um número inteiro válido");
            scanner.close();
            return;

        }
        divisor = scanner.nextInt();
        if (numerador < 0 || divisor <= 0) {
            System.out.println("Erro: Os números devem ser positivos e o divisor deve ser maior que zero.");
            scanner.close();
            return;
        }


        while (numerador >= divisor) {

            numerador = numerador - divisor;
        }
        resto = numerador;
        System.out.print(resto);

        scanner.close();

    }
}