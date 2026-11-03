public class Q96MatrixOperationsService {
    public record ResultadoMatricial(int[][] matrizSoma, int[][] matrizDiferenca) {}
    public Q96MatrixOperationsService() {
    }
    public static ResultadoMatricial calcularSomaEDiferenca(final int[][] matrizUm, int[][]matrizDois){
    if((matrizUm == null) || (matrizDois == null) || (matrizUm.length == 0) || (matrizDois.length == 0)){
        throw new IllegalArgumentException("DADOS DAS MATRIZES INVÁLIDOS!!");
    }
    int[][] matrizSoma = new int[3][4];
    int[][] matrizDiferenca = new int[3][4];

    for(int i =0;i< matrizUm.length;i++){
        for(int j=0;j<matrizDois.length;j++){
            matrizSoma[i][j] = matrizUm[i][j] + matrizDois[i][j];
            matrizDiferenca[i][j] = matrizUm[i][j] - matrizDois[i][j];
        }
    }
    return new ResultadoMatricial(matrizSoma, matrizDiferenca);
    }
}
