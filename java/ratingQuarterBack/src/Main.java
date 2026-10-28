import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double min = 0;
        double max = 2.375;

        System.out.println("Digite a quantidade de passes tentados: ");
        double ATT = scanner.nextDouble();
        if (ATT <= 0) {

            System.out.println("Digite um valor maior que zero para ATT: ");
            scanner.close();
            return;
        }

        System.out.println("Digite a quantidade de passes completados: ");
        int COMP = scanner.nextInt();

        System.out.println("Digite a quantidade de jardas passadas tentados: ");
        double YDS = scanner.nextDouble();

        System.out.println("Digite a quantidade de passes para tochdown: ");
        int TD = scanner.nextInt();

        System.out.println("Digite a quantidade de passes interceptados: ");
        int INT = scanner.nextInt();


        double A = ((COMP / ATT) - 0.3) / 0.2;
        double percPassesComp = Math.max(min, Math.min(A, max));

        double B = ((YDS / ATT) - 3) / 4;
        double mediaJardasTentativas = Math.max(min, Math.min(B, max));

        double C = (TD / ATT) / 0.05;
        double mediaTochTentativas = Math.max(min, Math.min(C, max));

        double D = (0.095 - (INT / ATT)) / 0.04;
        double mediaIntercepTentativas = Math.max(min, Math.min(D, max));


        double QB = (percPassesComp + mediaJardasTentativas + mediaIntercepTentativas + mediaTochTentativas) * 100 / 6;

        System.out.printf("A avaliação do QuarterBack foi de: %.1f\n", QB);

        scanner.close();

    }
}
