import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.printf("Digite qualquer caracteres: ");
        String input = scanner.nextLine().toLowerCase();
        char caracter = input.charAt(0);

        switch (caracter) {

            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                System.out.printf("O caracter digitado é um número.");
                break;

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.printf("O caracter digitado é uma vogal.");
                break;

            default:
                if (caracter >= 'a' && caracter <= 'z') {
                    System.out.printf("O caracter digitado é uma consoante.");
                } else {
                    System.out.printf("O caracter digitado é um simbolo.");
                }
                break;
        }
        scanner.close();
    }
}