import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira palavra: ");
        String primeiroTexto = scanner.nextLine();

        if (primeiroTexto.isBlank()) {
            System.out.println("ERROR!! Digite apenas texto!!");
            scanner.close();
            return;
        }

        System.out.println("Digite a segunda palavra: ");
        String segundoTexto = scanner.nextLine();

        if (segundoTexto.isBlank()) {
            System.out.println("ERROR!! Digite apenas texto!!");
            return;
        }
        boolean resultado = Questao80Service.contemTexto(primeiroTexto, segundoTexto);
        System.out.println(resultado);
        scanner.close();
    }
}