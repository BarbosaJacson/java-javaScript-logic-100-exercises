package services;

public class LatinSquareService {
    public LatinSquareService() {
    }

    public static boolean isLatinSquare(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            if (matrix[i] == null || matrix[i].length != n) {
                return false;
            }
        }

        for (int i = 0; i < n; i++) {
            if (!isValidRow(matrix, i, n)) {
                return false;
            }
        }

        for (int j = 0; j < n; j++) {
            if (!isValidColumn(matrix, j, n)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isValidRow(int[][] matrix, int row, int n) {
        boolean[] seen = new boolean[n + 1];

        for (int j = 0; j < n; j++) {
            int value = matrix[row][j];

            if (value < 1 || value > n || seen[value]) {
                return false;
            }

            seen[value] = true;
        }

        return true;
    }

    private static boolean isValidColumn(int[][] matrix, int col, int n) {
        boolean[] seen = new boolean[n + 1];

        for (int i = 0; i < n; i++) {
            int value = matrix[i][col];

            if (value < 1 || value > n || seen[value]) {
                return false;
            }

            seen[value] = true;
        }

        return true;
    }
}