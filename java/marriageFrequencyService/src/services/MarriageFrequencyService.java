package services;

public class MarriageFrequencyService {

    public static final int MIN_AGE = 18;
    public static final int MAX_AGE = 30;
    public static final int MATRIX_SIZE = MAX_AGE - MIN_AGE + 1;

    public static boolean isValidAge(int age) {
        return age >= MIN_AGE && age <= MAX_AGE;
    }

    public static void registerMarriage(int[][] frequencyMatrix, int manAge, int womanAge) {
        int rowIndex = manAge - MIN_AGE;
        int colIndex = womanAge - MIN_AGE;
        frequencyMatrix[rowIndex][colIndex]++;
    }

    public static int getMostFrequentManAge(int[][] frequencyMatrix) {
        int maxCount = 0;
        int bestAgeIndex = -1;

        for (int i = 0; i < MATRIX_SIZE; i++) {
            int rowSum = 0;
            for (int j = 0; j < MATRIX_SIZE; j++) {
                rowSum += frequencyMatrix[i][j];
            }
            if (rowSum > maxCount) {
                maxCount = rowSum;
                bestAgeIndex = i;
            }
        }

        return bestAgeIndex != -1 ? bestAgeIndex + MIN_AGE : -1;
    }

    public static int getMostFrequentWomanAge(int[][] frequencyMatrix) {
        int maxCount = 0;
        int bestAgeIndex = -1;

        for (int j = 0; j < MATRIX_SIZE; j++) {
            int colSum = 0;
            for (int i = 0; i < MATRIX_SIZE; i++) {
                colSum += frequencyMatrix[i][j];
            }
            if (colSum > maxCount) {
                maxCount = colSum;
                bestAgeIndex = j;
            }
        }

        return bestAgeIndex != -1 ? bestAgeIndex + MIN_AGE : -1;
    }

    public static int[] getMostFrequentCombination(int[][] frequencyMatrix) {
        int maxCount = 0;
        int bestManAgeIndex = -1;
        int bestWomanAgeIndex = -1;

        for (int i = 0; i < MATRIX_SIZE; i++) {
            for (int j = 0; j < MATRIX_SIZE; j++) {
                if (frequencyMatrix[i][j] > maxCount) {
                    maxCount = frequencyMatrix[i][j];
                    bestManAgeIndex = i;
                    bestWomanAgeIndex = j;
                }
            }
        }

        if (bestManAgeIndex != -1 && bestWomanAgeIndex != -1) {
            return new int[]{bestManAgeIndex + MIN_AGE, bestWomanAgeIndex + MIN_AGE};
        }

        return new int[]{-1, -1};
    }
}