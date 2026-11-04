package services;

import java.util.Arrays;

public final class Q97_CalculateMatrixService {

    private Q97_CalculateMatrixService() {}

    public static int[][] permutarMatriz(final int[][] matrizOriginal, final int x, final int y) {
        if (matrizOriginal == null || matrizOriginal.length != 5) {
            throw new IllegalArgumentException("A matriz deve possuir dimensão 5x5.");
        }

        for (int i = 0; i < 5; i++) {
            if (matrizOriginal[i] == null || matrizOriginal[i].length != 5) {
                throw new IllegalArgumentException("Todas as linhas devem possuir exatamente 5 colunas.");
            }
        }

        if (x < 0 || x >= 5 || y < 0 || y >= 5) {
            throw new IllegalArgumentException("Os índices x e y devem estar no intervalo de 0 a 4.");
        }

        int[][] matrizModificada = new int[5][5];
        for (int i = 0; i < 5; i++) {
            matrizModificada[i] = Arrays.copyOf(matrizOriginal[i], 5);
        }

        for (int j = 0; j < 5; j++) {
            int temp = matrizModificada[x][j];
            matrizModificada[x][j] = matrizModificada[y][j];
            matrizModificada[y][j] = temp;
        }

        for (int i = 0; i < 5; i++) {
            int temp = matrizModificada[i][x];
            matrizModificada[i][x] = matrizModificada[i][y];
            matrizModificada[i][y] = temp;
        }

        for (int i = 0; i < 5; i++) {
            int temp = matrizModificada[i][i];
            matrizModificada[i][i] = matrizModificada[i][4 - i];
            matrizModificada[i][4 - i] = temp;
        }

        return matrizModificada;
    }
}