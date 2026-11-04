import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double lado;
        double area;
        double perimetro;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.printf("Digite o valor em metros do lado: ");
        lado = scanner.nextDouble();

        area = lado * lado;
        perimetro = 2 * (lado + lado);

        System.out.printf("A area do quadrado é: %.2f%n", area);
        System.out.printf("O perimetro do quadrado é: %.2f%n", perimetro);

    }
}
