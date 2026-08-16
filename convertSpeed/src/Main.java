import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.printf("Digite a velocidade: ");
        double ms = scanner.nextDouble();
        double conversao = ms * 3.6;

        System.out.printf("A velocidade em KM/h é : %.2f km/h", conversao);

    }
}