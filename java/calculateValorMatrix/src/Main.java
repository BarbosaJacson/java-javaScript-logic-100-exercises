import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[6][6];
        System.out.println("Digite um numero inteiro: ");
        ;
        if (!scanner.hasNextInt()) {
            System.out.println("ERROR!! Digite um número inteiro válido!!");
            scanner.close();
            return;
        }
        int valorEscalar = scanner.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Digite o próximo númento pra preencher a matriz: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("ERROR!! Digite um número inteiro válido!!");
                    scanner.close();
                    return;
                }
                matriz[i][j] = scanner.nextInt();
                System.out.println("Número adicionado na matriz:  " + matriz[i][j]);
            }
            System.out.println();
        }

        int MatrizResultante[][] = Questao94Service.calculateValorMatriz(valorEscalar, matriz);
        System.out.println("Os valores da matriz recalculada são: " + Arrays.deepToString(MatrizResultante));
        scanner.close();
    }

}