import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número em Romano: ");
        String textoRomano = scanner.nextLine();

        if (textoRomano.isBlank()) {
            System.out.println("ERROR!! Digite um texto válido!!");
            scanner.close();
            return;
        }

    int numeroConvertido = Questao86Service.converterRomanoParaDecimal(textoRomano);
    System.out.println("O número romano convertido para decimal de base 10 é: "+numeroConvertido);
    scanner.close();
    }
}