import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.printf("Digita uma letra do alfabeto: ");
        char letra = scanner.nextLine().toLowerCase().charAt(0);

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.printf("A letra " + letra + " é uma vogal.\n");
                break;
            default:
                System.out.println("A letra " + letra + " é uma consoante.");
                break;

        }
        scanner.close();
    }
}