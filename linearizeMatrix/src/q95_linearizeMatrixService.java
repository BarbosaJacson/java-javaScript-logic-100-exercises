public class q95_linearizeMatrixService {
    public q95_linearizeMatrixService() {
    }

    public static int[] linearizeMatrix(final int[][] matriz) {
        if (matriz == null || matriz.length == 0) {
            throw new IllegalArgumentException("ERROR!! Valores da matriz inválidos!!");
        }
        int k = 0;
        int totalElementos = matriz.length * matriz[0].length;
        int[] vetorResultante = new int[totalElementos];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                vetorResultante[k++] = matriz[i][j];
            }
        }
        return vetorResultante;
    }
}
