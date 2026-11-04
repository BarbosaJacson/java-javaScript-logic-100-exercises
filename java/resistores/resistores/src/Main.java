import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.printf("Insira o valor da 1º resistencia: ");
        double r1 = scanner.nextDouble();
        System.out.printf("Insira o valor da 2º resistencia: ");
        double r2 = scanner.nextDouble();
        System.out.printf("Insira o valor da 3º resistencia: ");
        double r3 = scanner.nextDouble();

        double R12 = (r1 * r2) / (r1 + r2);
        double Req = R12 + r3;

        System.out.printf("A Resistencia equivalente é: %d\n", Req);
        scanner.close();
    }
}