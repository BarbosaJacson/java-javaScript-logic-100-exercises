import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int ervas = 1;
        int gafanhoto = 2;
        int broca = 3;
        int todos = 4;
        double custoBruto = 0.0;

        System.out.print("Qual tipo de praga?(insira um nuemro inteiro de 1 a 4) ");
        int praga = scanner.nextInt();

        System.out.print("Quantos acres? ");
        double acres = scanner.nextDouble();

        double precoPorAcre = switch (praga) {
            case 1 -> 50.0;
            case 2 -> 100.0;
            case 3 -> 150.0;
            default -> 250.0;
        };
        custoBruto = acres * precoPorAcre;


        if (acres > 1000) {
            custoBruto = custoBruto * 0.95;
        }

        if (custoBruto > 750.00) {
            double excedente = custoBruto - 750.00;
            custoBruto = 750.00 + (excedente * 0.90);
        }

        System.out.printf("O custo total é de  " + custoBruto);
    }
}