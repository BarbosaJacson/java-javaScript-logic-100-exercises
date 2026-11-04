import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.printf("O valor da compra foi de: ");
        double compra = scanner.nextDouble();

        double parcelas = (int) compra / 3;
        double entrada = (compra - (parcelas * 2));

        System.out.println("A entrada é : " + entrada);
        System.out.println("Cada parcela é de: " + parcelas);

        scanner.close();
    }
}
