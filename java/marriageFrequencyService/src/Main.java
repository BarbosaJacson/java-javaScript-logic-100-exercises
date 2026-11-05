import services.MarriageFrequencyService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] frequencyMatrix = new int[MarriageFrequencyService.MATRIX_SIZE][MarriageFrequencyService.MATRIX_SIZE];

        while (true) {
            System.out.print("Digite a idade do homem (18 a 30): ");
            if (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Encerramento por falha rápida (Fail-Fast).");
                break;
            }
            int manAge = scanner.nextInt();

            System.out.print("Digite a idade da mulher (18 a 30): ");
            if (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Encerramento por falha rápida (Fail-Fast).");
                break;
            }
            int womanAge = scanner.nextInt();

            if (!MarriageFrequencyService.isValidAge(manAge) || !MarriageFrequencyService.isValidAge(womanAge)) {
                System.out.println("Idade fora do intervalo permitido (18-30). Leitura encerrada.");
                break;
            }

            MarriageFrequencyService.registerMarriage(frequencyMatrix, manAge, womanAge);
        }

        System.out.println("\n=== RELATÓRIO ESTATÍSTICO DE CASAMENTOS ===");

        int mostFrequentManAge = MarriageFrequencyService.getMostFrequentManAge(frequencyMatrix);
        System.out.println("(1) Idade mais frequente de casamento dos homens: " + (mostFrequentManAge > 0 ? mostFrequentManAge + " anos" : "Nenhum registro"));

        int mostFrequentWomanAge = MarriageFrequencyService.getMostFrequentWomanAge(frequencyMatrix);
        System.out.println("(2) Idade mais frequente de casamento das mulheres: " + (mostFrequentWomanAge > 0 ? mostFrequentWomanAge + " anos" : "Nenhum registro"));

        int[] combination = MarriageFrequencyService.getMostFrequentCombination(frequencyMatrix);
        if (combination[0] > 0 && combination[1] > 0) {
            System.out.println("(3) Combinação mais frequente: Homem com " + combination[0] + " anos e Mulher com " + combination[1] + " anos.");
        } else {
            System.out.println("(3) Combinação mais frequente: Nenhum registro valido.");
        }

        scanner.close();
    }
}