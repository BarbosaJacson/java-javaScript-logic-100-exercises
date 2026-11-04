public class Questao93Service {
    public Questao93Service() {
    }
    public static ResultadoDiagonaisDTO calcularSomasDiagonais(final int[][] matriz) {
        if (matriz == null || matriz.length == 0) {
            throw new IllegalArgumentException("ERROR!! Os valores da matriz são inválidos!!");
        }
        int n = matriz.length;
        int somaPrincipal = 0;
        int somaSecundaria = 0;

        for (int i = 0; i < n; i++) {
            somaPrincipal += matriz[i][i];
            somaSecundaria += matriz[i][n - 1 - i];
        }
        return new ResultadoDiagonaisDTO(somaPrincipal, somaSecundaria);
    }
    public record ResultadoDiagonaisDTO(int somaPrincipal, int somaSecundaria) {
    }

}
