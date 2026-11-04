import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.printf("Digite o número inteiro: ");
        int numero = scanner.nextInt();
        int invertido = 0;
        while(numero != 0) {
            int ultimoDigito = (numero % 10);
            invertido = (invertido * 10) + ultimoDigito;
            numero /= 10;

        }

        System.out.printf("O número invertido é: %d\n", invertido);
        scanner.close();

    }
}