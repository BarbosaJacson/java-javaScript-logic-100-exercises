import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva uma palavra: ");
        if (!scanner.hasNextLine()) {
            System.out.print("ERROR!!Escreva apenas uma palavra");
            scanner.close();
            return;

        }
        String palavra = scanner.nextLine().toLowerCase();
        int resultado = contarVogaisStream(palavra);

    }

    public static int contarVogaisStream(String palavra) {
        if (palavra == null || palavra.isBlank()) {
            return 0;
        }
        int count = (int) palavra.chars().filter(ch -> "aeiou".indexOf(ch) != -1).count();
        System.out.print("A palavra " + palavra + " tem " + count + " vogais.");

        return count;

    }

}
