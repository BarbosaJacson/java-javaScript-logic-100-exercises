import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        Random random = new Random();
        int tamanho = 15;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < tamanho; i++) {
            list.add(random.nextInt(tamanho) + 1);
        }
        System.out.println("Lista Desordenada: " + list);

        List<Integer> listOrdenada = list.stream().sorted().toList();
        System.out.println("Lista Ordenada: " + listOrdenada);

        scanner.close();
    }
}