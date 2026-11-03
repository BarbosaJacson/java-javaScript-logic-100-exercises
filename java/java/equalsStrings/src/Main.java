import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira palavra!");

        if (!scanner.hasNextLine()) {
            System.out.println("ERROR!!Digite apenas palavras!!");
            scanner.close();
            return;
        }
        String primeiraPalavra = scanner.nextLine();


        System.out.println("Digite a segunda palavra!");

        if (!scanner.hasNextLine()) {
            System.out.println("ERROR!!Digite apenas palavras!!");
            scanner.close();
            return;
        }
        String segundaPalavra = scanner.nextLine();

        Boolean retorno = Questao87Service.compareStrings(primeiraPalavra, segundaPalavra);
        System.out.println("As duas strings são iguais? R: " + retorno);
        scanner.close();

    }
}