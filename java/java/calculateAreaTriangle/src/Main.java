import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.printf("Digite o lado a: ");
        double ladoA = scanner.nextDouble();

        System.out.printf("Digite o lado b: ");
        double ladoB = scanner.nextDouble();

        System.out.printf("Digite o lado c: ");
        double ladoC = scanner.nextDouble();

        double perimetro = ladoA + ladoB + ladoC;

        System.out.printf("A area do triangulo é: %.2f%n", perimetro);

        scanner.close();
    }
}