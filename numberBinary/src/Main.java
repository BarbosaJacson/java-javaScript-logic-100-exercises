import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.printf("Digite um numero entre 0 e 31: ");
        int number = scanner.nextInt();
        int resto=0;

        ArrayList<Integer> lista = new ArrayList<>();
        while (number > 0){

            resto = number % 2;
            number = number / 2;
            lista.add(resto);
        }
        Collections.reverse(lista);

        System.out.println(lista);

    }
}