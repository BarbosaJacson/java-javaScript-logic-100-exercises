import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.printf("Digite o raio: ");
        double raio = scanner.nextDouble();

        System.out.printf("Digite a altura: ");
        double altura = scanner.nextDouble();

        double volume = Math.PI * Math.pow(raio, 2) * altura;


        System.out.printf("O volume do cilindro é: %.2f%n", volume);

        scanner.close();

    }
}