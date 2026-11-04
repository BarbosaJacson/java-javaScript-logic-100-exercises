import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrizA = new int[5][5];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                System.out.println("Digite um número inteiro: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("ERROR!! Digite um número inteiro válido!!");
                    scanner.close();
                    return;
                }
                matrizA[i][j] = scanner.nextInt();
            }
        }
        Questao93Service.ResultadoDiagonaisDTO matrizFinal = Questao93Service.calcularSomasDiagonais(matrizA);
        System.out.println("Soma das Linhas: " + matrizFinal.somaSecundaria());
        System.out.println("Soma das Colunas: " + matrizFinal.somaPrincipal());
        scanner.close();
    }
}