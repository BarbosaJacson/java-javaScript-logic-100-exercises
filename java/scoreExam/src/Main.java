import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double nota = 0.0;
        double notaSoma = 0.0;

        for (int i = 0; i < 4; i++) {
            System.out.printf("Digite a %dª nota: ", i + 1);
            nota = scanner.nextDouble();
            notaSoma += nota;

        }
        double semestre = notaSoma / 4;
        System.out.printf("A nota semestral é: %.2f\n", semestre);

    }
}