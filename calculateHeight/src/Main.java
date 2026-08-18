import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.printf("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.printf("Digite o tamanho da sua sombra: ");
        double suaSombra = scanner.nextDouble();

        System.out.printf("Digite a sombra do predio: ");
        double sombraPredio = scanner.nextDouble();

        double alturaPredio = (altura * sombraPredio) / suaSombra;

        System.out.printf("A altura do prédio é de: %.2f metros", alturaPredio);
        scanner.close();

    }
}