public class Questao91Service {
    public Questao91Service() {
    }

    public static ResultadoMatrizDTO calcularSomasMatriz(final int[][] matriz) {
        if (matriz == null || matriz.length == 0) {
            throw new IllegalArgumentException("ERROR!! Os valores da matriz são inválidos!!");
        }
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int[] somaLinhas = new int[linhas];
        int[] somaColunas = new int[colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                somaLinhas[i] += matriz[i][j];
                somaColunas[j] += matriz[i][j];
            }
        }
        return new ResultadoMatrizDTO(somaLinhas, somaColunas);
    }

    public record ResultadoMatrizDTO(int[] somaLinhas, int[] somaColunas) {
    }

}
