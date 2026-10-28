import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.printf("Digite a renda mensal: ");
        double renda = scanner.nextDouble();

        System.out.printf("Digite o valor do empréstimo: ");
        double emprestimo = scanner.nextDouble();

        System.out.printf("Digite a quantidade de parcelas: ");
        int qtde = scanner.nextInt();

        double limite = renda * 10;
        double mensal = renda * 0.3;
        double parcela = emprestimo / qtde;

        if (emprestimo > limite || parcela > mensal) {
            System.out.println("O empréstimo não poderá ser efetuado, tente um valor inferior.");
        } else {
            System.out.println("Empréstimo aprovado.");
        }
        scanner.close();

    }
}