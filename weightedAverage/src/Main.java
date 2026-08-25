import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double maior = Double.NEGATIVE_INFINITY;
        double pesoMaior = 5;
        double peso = 2.5;
        double notas = 0.0;
        double somaTotal = 0.0;
        double somaMenores = 0.0;

        System.out.print("Quantas notas irá digitar? ");
        int qtde = scanner.nextInt();
        double mediaPonderada = 0.0;

        for (int i = 1; i <= qtde; i++) {
            System.out.printf("Digite a " + i + "º nota: ");
            notas = scanner.nextDouble();
            somaTotal += notas;

            if (notas > maior) {
                maior = notas;
            }
        }
        somaMenores = somaTotal - maior;
        mediaPonderada = ((somaMenores * peso) + (maior * pesoMaior)) / (pesoMaior + (peso * (qtde - 1)));
        System.out.printf("A média ponderada é: " + mediaPonderada);

        scanner.close();
    }
}