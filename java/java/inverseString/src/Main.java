import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra ou texto: ");

        if (!scanner.hasNextLine()) {
            System.out.print("Digite apenas letras: ");
            scanner.close();
            return;
        }
        String texto = scanner.nextLine();
        String resultadoInvertido = Questao77Service.inverterTexto(texto);
        System.out.println("Texto invertido: " + resultadoInvertido);
    }
}



