import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String textoOriiginal = scanner.nextLine();

        if (textoOriiginal.isBlank()) {
            System.out.println("ERROR!!Digite uma palavra válida!!");
            scanner.close();
            return;
        }
        String reordenada = Questao90Service.reordenarVogaisEConsoantes(textoOriiginal);
        System.out.println("A palavra reordenada é: "+reordenada);
        scanner.close();
    }
}