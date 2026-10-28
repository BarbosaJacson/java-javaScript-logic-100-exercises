import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número hexadecimal (ex: 1A, FF, 2A3F): ");
        String hexTexto = scanner.nextLine();

        if (hexTexto == null || hexTexto.isBlank()) {
            System.out.println("ERROR!! Digite um número válido!!");
            scanner.close();
            return;
        }

        int resultadoDecimal = Questao85Service.converterHexParaDecimal(hexTexto);
        if(resultadoDecimal != -1){
        System.out.println("O valor decimal é:  "+resultadoDecimal);} else
        {System.out.println("Falha na conversão.");}
        scanner.close();
    }

}