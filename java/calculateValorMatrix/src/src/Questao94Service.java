public class Questao94Service {
    public Questao94Service() {
    }

    public static int[][] calculateValorMatriz(int valorEscalar, final int[][] matriz) {
        if (matriz == null || matriz.length == 0) {
            throw new IllegalArgumentException("ERROR!! Valores da matriz inválidos!!");
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = matriz[i][j] * valorEscalar;
            }
        }
        return matriz;
    }
}
