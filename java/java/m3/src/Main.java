import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        Random random = new Random();
        int tamanho = 20;
        int[] vetor = new int[tamanho];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(tamanho) + 1;
        }
        Arrays.sort(vetor);
        System.out.println("Vetor ordenado: "+Arrays.toString(vetor));

        double media = Arrays.stream(vetor).average().orElse(0.0);
        double mediana = (double) (vetor[9] + vetor[10]) / 2.0;

        Map<Integer, Long> mapaFrequencia = Arrays.stream(vetor)
                .boxed()
                .collect(Collectors.groupingBy(
                        numero -> numero,
                        Collectors.counting()
                ));
        int moda = mapaFrequencia.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(-1);
        System.out.printf("Moda: %d | Média: %.2f | Mediana: %.2f%n", moda, media, mediana);
        scanner.close();
    }
}