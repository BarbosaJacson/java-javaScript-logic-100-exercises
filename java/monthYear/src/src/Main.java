import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.printf("Digite o número do mês: ");
        int mes = scanner.nextInt();

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("Mês termina em 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("Mês termina em 30");
                break;

            case 2:
                System.out.printf("Mês bisexto termina em 29, ou não bisexto termina em 28");
                break;

            default:
                System.out.print("Mês inválido");
                break;
        }
        scanner.close();
    }
}