import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String textoOriginal = scanner.nextLine().toLowerCase().trim();
        if (textoOriginal.isBlank()) {
            System.out.print("ERRO: O caractere alvo não pode ser vazio!");
            scanner.close();
            return;
        }
        System.out.println(textoOriginal);
        System.out.println("Digite qualquer caracter contido na palavra ou frase: ");
        String entradaAlvo = scanner.nextLine().toLowerCase().trim();
        if (entradaAlvo.isBlank()) {
            System.out.print("ERROR!!Digite apenas palavras!!");
            scanner.close();
            return;
        }
        System.out.println(entradaAlvo);

        long total = Questao78Service.contarOcorrencias(textoOriginal, entradaAlvo);
        System.out.println("O texto contém " + total + " ocorrência(s) do caractere '" + entradaAlvo.charAt(0) + "'.");

        scanner.close();
    }

}