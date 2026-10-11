import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase ou texto: ");
        String textoOriginal = scanner.nextLine();

        if (textoOriginal.isBlank()) {
            System.out.println("ERROR!! Digieta apenas texto:");
            scanner.close();
            return;
        }
        System.out.println("Texto: " + textoOriginal);

        String retorno = Questao81Service.normalizarTexto(textoOriginal);
        System.out.println(retorno);

        scanner.close();
    }
}