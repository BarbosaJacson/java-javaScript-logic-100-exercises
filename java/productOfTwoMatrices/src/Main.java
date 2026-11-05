import services.MatrixMultiplicationService;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrizA = new int[4][3];
        int[][] matrizB = new int[3][2];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print("Digite o elemento A[" + i + "][" + j + "]: ");
                if (!scanner.hasNextInt()) {
                    System.out.print("Entrada inválida! O programa será encerrado. Reinicie a aplicação. ");
                    scanner.close();
                    return;
                }
                matrizA[i][j] = scanner.nextInt();
            }
        }
        for (int k = 0; k < matrizB.length; k++) {
            for (int n = 0; n < matrizB[k].length; n++) {
                System.out.print("Digite o elemento B[" + k + "][" + n + "]: ");
                if (!scanner.hasNextInt()) {
                    System.out.print("Entrada inválida! O programa será encerrado. Reinicie a aplicação. ");
                    scanner.close();
                    return;
                }
                matrizB[k][n] = scanner.nextInt();
            }
        }
        int matrizResultado[][] = MatrixMultiplicationService.multiply(matrizA, matrizB);
        System.out.println(Arrays.deepToString(matrizResultado));
        scanner.close();
    }
}