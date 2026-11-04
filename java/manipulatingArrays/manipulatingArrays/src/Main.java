import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        int vetor = 0;
        int dados = 30;
        int elementoExtra = random.nextInt(dados);
        int valor = random.nextInt(dados);

        for (int i = 0; i < dados; i++) {
            vetor = random.nextInt(dados);
            list.add(vetor);
        }
        list.sort(Comparator.naturalOrder());
        System.out.println("Lista inicial (ordenada): " + list);

        // a. Inserir no final
        list.add(elementoExtra);
        System.out.println("a. Após inserir " + elementoExtra + " no final: " + list);

        // b. Inserir na posição 7
        list.add(7, elementoExtra);
        System.out.println("b. Após inserir " + elementoExtra + " no índice 7: " + list);

        // c. Remover do índice 13
        list.remove(13);
        System.out.println("c. Após remover do índice 13: " + list);

        // d. Remover todos os iguais ao valor sortead
        list.removeIf(n -> n == valor);
        System.out.println("d. Após remover todos os elementos iguais a " + valor + ": " + list);

        // e. Nova lista sem duplicidades
        List<Integer> listSemDuplicatas = new ArrayList<>(list.stream().distinct().toList());
        listSemDuplicatas.sort(Comparator.naturalOrder());
        System.out.println("e. Nova lista (sem duplicidades): " + listSemDuplicatas);

        scanner.close();
    }
}