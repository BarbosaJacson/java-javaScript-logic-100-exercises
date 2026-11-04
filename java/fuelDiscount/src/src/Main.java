import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double alcool = 1.90;
        double gasolina = 2.70;
        double taxaA1 = 0.98;
        double taxaA2 = 0.96;
        double taxaG1 = 0.97;
        double taxaG2 = 0.95;
        double preco = 0.0;

        System.out.printf("Digite o tipo de combustível: ");
        String combustivel = scanner.nextLine().trim().toUpperCase().toLowerCase();

        System.out.printf("Digite a quantidade em litros: ");
        double litros = scanner.nextDouble();

        if (combustivel.equals("a") && (litros <= 25)) {

            preco = (alcool * taxaA1) * litros;

        } else if (combustivel.equals("a") && (litros > 25)) {

            preco = (alcool * taxaA2) * litros;

        } else if (combustivel.equals("g") && (litros > 25)) {
            preco = (gasolina * taxaG2) * litros;

        } else if (combustivel.equals("g") && (litros <= 25)) {

            preco = (gasolina * taxaG1) * litros;
        }

        System.out.printf("O preço do combustível com desconto é de: R$ %.2f\n", preco);
        scanner.close();
    }
}
