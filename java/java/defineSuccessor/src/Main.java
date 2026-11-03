import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.printf("Digite qualquer número inteiro: ");
        int numero = scanner.nextInt();
        int sucessor = numero + 1;

        System.out.printf("O sucessor do " + numero + " é " + sucessor + ".");
        scanner.close();

    }
}