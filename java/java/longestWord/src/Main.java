import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase ou texto: ");
        String textoOriginal = scanner.nextLine();
        if (textoOriginal.isBlank()) {
            System.out.println("ERROR!! Digite um texto válido!!");
            scanner.close();
            return;
        }

        String retorno = Questao82Service.encontrarMaiorPalavra(textoOriginal);
        System.out.println("A maior palavra é: " + retorno);
        scanner.close();
    }
}