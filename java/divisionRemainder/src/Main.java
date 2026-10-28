import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.printf("Digite o primeiro numero inteiro: ");
        int numberA = scanner.nextInt();
        System.out.printf("Digite o segundo numero inteiro: ");
        int numberB = scanner.nextInt();

        int result = numberA / numberB;
        int rest = numberA % numberB;

        System.out.printf("O quociente da divisão é: %d%n", result);
        System.out.printf("O resto da divisão é: %d%n", rest);

        scanner.close();
    }
}