import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Digite um número inteiro: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("ERROR!!Digite um número inteiro válido!!");
                    scanner.close();
                    return;
                }
                matriz[i][j] = scanner.nextInt();
            }
        }
        Boolean ehSimetrica = Questao92Service.ehMatrizSimetrica(matriz);
        System.out.println("A matriz é simétrica?  " + ehSimetrica);
        scanner.close();
    }
}