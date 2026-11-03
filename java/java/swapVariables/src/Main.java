import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int aux = 0;
        System.out.printf("Digite a primeira variavel: ");
        int primeira = scanner.nextInt();

        System.out.printf("Digite a segunda variavel: ");
        int segunda = scanner.nextInt();

        //Forma com variavel auxiliar
        //aux = primeira;
        //primeira = segunda;
        //segunda = aux;

        //Forma sem variavel auxiliar
        primeira = primeira + segunda;
        segunda = primeira - segunda;
        primeira = primeira - segunda;

        System.out.printf("Primeira variavel: %d\n", primeira);
        System.out.printf("Segunda variavel: %d\n", segunda);
        scanner.close();

    }
}
