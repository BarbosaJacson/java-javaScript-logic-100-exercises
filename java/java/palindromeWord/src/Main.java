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

        Boolean retorno = Questao84Service.palindromePalavra(textoOriginal);
        System.out.println("A palavra é um palinrome? " + retorno);
        scanner.close();
    }
}