import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double taxa = 0.11;
        double desconto = 0.0;
        double maxDesconto = 334.29;

        System.out.printf("Digite o valor do salário: ");
        double remuneracao = scanner.nextDouble();

        desconto = remuneracao * taxa;

        if (desconto > maxDesconto) {
            desconto = maxDesconto;
        }

        System.out.println("O salário com desconto previdenciário é de  " + (remuneracao - desconto));
        System.out.println("O desconto previdenciário é de  " + (desconto));

        scanner.close();
    }
}