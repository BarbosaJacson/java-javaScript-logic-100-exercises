import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Digita a nota do primeiro exame:");
        double e1 = scanner.nextDouble();
        System.out.println("Digita a nota do segundo exame:");
        double e2 = scanner.nextDouble();
        System.out.println("Digita a nota do terceiro exame:");
        double e3 = scanner.nextDouble();
        System.out.println("Digita a nota do quarto exame:");
        double e4 = scanner.nextDouble();
        System.out.println("Digita a nota do quinto exame:");
        double e5 = scanner.nextDouble();

        boolean pI = e1 >= 70;
        boolean pII = e2 >= 70;
        boolean pIII = e3 >= 70;
        boolean pIV = e4 >= 70;
        boolean pV = e5 >= 70;

        if (pI && pII && pIII && pIV && pV) {
            System.out.println("Classificação A.");
        } else if (pI && pII && pIV && !pIII && !pV) {
            System.out.println("Classificação B.");
        } else if (pI && pII && (pIII || pIV) && !pV) {
            System.out.println("Classificação C.");
        } else {
            System.out.println("Reprovado.");
        }
        scanner.close();
    }
}