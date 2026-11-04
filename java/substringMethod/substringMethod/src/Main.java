import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digita uma palavra ou texto: ");
        String textoOriginal = scanner.nextLine().trim();

        if(textoOriginal.isBlank()){
            System.out.println("ERROR!! Digite uma palavra!!");
            scanner.close();
            return;
        }
        int tamanho = textoOriginal.length();
        System.out.println(textoOriginal);

        System.out.println("Digite o indice inicial que está entre 0 e "+ tamanho+":");

        if(!scanner.hasNextInt()){
            System.out.println("ERROR!! Digite um número entre 0 e "+tamanho+":");
            scanner.close();
            return;
        }
        int indiceInicial = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o indice final que está entre "+indiceInicial+" e "+ tamanho+":");

        if(!scanner.hasNextInt()){
            System.out.println("ERROR!! Digite o indice final que está entre "+indiceInicial+" e "+ tamanho+":");
            scanner.close();
            return;
        }
        int indiceFinal = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Indice inicial: "+indiceInicial);
        System.out.println("Indice Final: "+indiceFinal);
        scanner.close();

        String resultado = Questao79Service.extrairSubstring(textoOriginal, indiceInicial, indiceFinal);
        System.out.println("O substring do texto original é: "+resultado);


        scanner.close();
    }


}