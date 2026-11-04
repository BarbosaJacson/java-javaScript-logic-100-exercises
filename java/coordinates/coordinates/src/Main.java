import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.printf("Insira a coordenada X: ");
        double inputX = scanner.nextDouble();

        System.out.printf("Insira a coordenada Y: ");
        double inputY = scanner.nextDouble();

        if (inputX == 0 && inputY == 0) {
            System.out.println("Origem");
        } else if (inputX == 0) {
            System.out.println("Eixo Y");
        } else if (inputY == 0) {
            System.out.println("Eixo X");
        } else if (inputX > 0 && inputY > 0) {
            System.out.println("Q1");
        } else if (inputX < 0 && inputY > 0) {
            System.out.println("Q2");
        } else if (inputX < 0 && inputY < 0) {
            System.out.println("Q3");
        } else if (inputX > 0 && inputY < 0) {
            System.out.println("Q4");
        }
        scanner.close();
    }
}



