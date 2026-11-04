public class Questao92Service {
    public Questao92Service() {
    }

    public static Boolean ehMatrizSimetrica(final int[][] matriz) {
        if ((matriz == null || matriz.length == 0) || (matriz.length != matriz[0].length)) {
            return false;
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = (i + 1);j < matriz[i].length; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
