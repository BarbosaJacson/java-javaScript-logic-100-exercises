import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double[] vetor = new double[30];

        // 1. Leitura e validação do índice pluviométrico para os 30 dias de junho
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o índice pluviométrico (mm) do dia %d: ", i + 1);

            if (!scanner.hasNextDouble()) {
                System.out.println("ERROR! Digite um número decimal válido!");
                scanner.close();
                return;
            }

            double valor = scanner.nextDouble();

            if (valor < 0) {
                System.out.println("ERROR! O índice pluviométrico não pode ser negativo!");
                scanner.close();
                return;
            }

            vetor[i] = valor;
        }

        // 2. Processamento funcional com Streams
        double maxChuva = Arrays.stream(vetor).max().getAsDouble();
        double minChuva = Arrays.stream(vetor).min().getAsDouble();

        int diaMaisChuvoso = IntStream.range(0, vetor.length)
                .filter(i -> vetor[i] == maxChuva)
                .findFirst()
                .orElse(-1) + 1;

        int diaMenosChuvoso = IntStream.range(0, vetor.length)
                .filter(i -> vetor[i] == minChuva)
                .findFirst()
                .orElse(-1) + 1;

        double mediaPrimeiraQuinzena = Arrays.stream(vetor, 0, 15).average().getAsDouble();
        double mediaSegundaQuinzena = Arrays.stream(vetor, 15, 30).average().getAsDouble();

        // 3. Exibição formatada dos resultados
        System.out.println("\n--- RELATÓRIO PLUVIOMÉTRICO (JUNHO) ---");
        System.out.printf("Dia que mais choveu: Dia %d (%.1f mm)%n", diaMaisChuvoso, maxChuva);
        System.out.printf("Dia que menos choveu: Dia %d (%.1f mm)%n", diaMenosChuvoso, minChuva);
        System.out.printf("Média 1ª Quinzena: %.2f mm%n", mediaPrimeiraQuinzena);
        System.out.printf("Média 2ª Quinzena: %.2f mm%n", mediaSegundaQuinzena);

        scanner.close();
    }
}