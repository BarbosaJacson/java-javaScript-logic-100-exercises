import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome completo: ");
        String nomeCompleto = scanner.nextLine();

        if (nomeCompleto.isBlank()) {
            System.out.println("ERROR!! Digite o nome completo válidos!!");
            scanner.close();
            return;
        }
        String retorno = Questao89Service.convertNameToInitials(nomeCompleto);
        System.out.println("As iniciais são:  " + retorno);
        scanner.close();
    }
}