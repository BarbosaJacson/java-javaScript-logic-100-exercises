import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double equation = 0;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.printf("Digite o valor de a: ");
        double A = scanner.nextDouble();

        System.out.printf("Digite o valor de b: ");
        double B = scanner.nextDouble();

        if (A != 0) {
            equation = (B * -1) / A;
            System.out.printf("O resultado da equação de 1º Grau é: " + equation);

        } else {

            System.out.printf("O valor de A na equação precisa ser diferente de zero");

        }
        scanner.close();
    }
}