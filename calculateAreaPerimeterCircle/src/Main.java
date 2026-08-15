import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double raio;
        double Pi = 3.14159;
        double area;

        System.out.printf("Digite o raio:  ");
        raio = scanner.nextDouble();
        area = Pi * (Math.pow(raio, 2));

        System.out.printf("A area do circulo é:  %.2f%n", area);
    }
}
