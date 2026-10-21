import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra ou texto: ");
        String textoOriginal = scanner.nextLine();

        if (textoOriginal.isBlank()) {
            System.out.println("ERROR!! Digite uma palavra ou texto válidos!!");
            scanner.close();
            return;
        }
        String retorno = Questao88Service.convertToUpperCase(textoOriginal);
        System.out.println("O texto em caixa alta é:  " + retorno);
        scanner.close();
    }
}