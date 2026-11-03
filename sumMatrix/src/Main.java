import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] matrizA = new int[3][4];
        int[][] matrizB = new int[3][4];

        System.out.println("--- Preenchimento da Matriz A (3x4) ---");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length;j++) {
                System.out.println("Digite um número inteiro: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("ERROR!! Digite um número inteiro válido!!");
                    scanner.close();
                    return;
                }
                matrizA[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\n--- Preenchimento da Matriz B (3x4) ---");
        for (int k = 0; k < matrizB.length; k++) {
            for (int n = 0; n < matrizB[k].length;n++) {
                System.out.println("Digite um número inteiro: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("ERROR!! Digite um número inteiro válido!!");
                    scanner.close();
                    return;
                }
               matrizB[k][n] = scanner.nextInt();
            }
        }
        Q96MatrixOperationsService.ResultadoMatricial resultado = Q96MatrixOperationsService.calcularSomaEDiferenca(matrizA, matrizB);
        int[][] soma = resultado.matrizSoma();
        int[][] diferenca = resultado.matrizDiferenca();
        System.out.println("\n--- Matriz Soma (3x4) ---");
        System.out.println(Arrays.deepToString(resultado.matrizSoma()));

        System.out.println("\n--- Matriz Diferença (3x4) ---");
        System.out.println(Arrays.deepToString(resultado.matrizDiferenca()));

        scanner.close();
    }
}