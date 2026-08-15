import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        double base;
        double altura;
        double area;
        double perimetro;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.printf("Digite o valor da base do retângulo: ");
        base=scanner.nextDouble();
        scanner.nextLine();

        System.out.printf("Digite o valor da altura do retângulo:  ");
        altura=scanner.nextDouble();
        scanner.nextLine();

        area = base * altura;
        perimetro = 2 * (base + altura);

        System.out.printf("A área do retângulo é: %.2f%n", area);
        System.out.printf("O perímetro do retângulo é: %.2f%n", perimetro);



    }
}