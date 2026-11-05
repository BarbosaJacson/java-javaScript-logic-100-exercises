export class MarriageFrequencyService {
    static MIN_AGE = 18;
    static MAX_AGE = 30;
    static MATRIX_SIZE = MarriageFrequencyService.MAX_AGE - MarriageFrequencyService.MIN_AGE + 1;

    static createFrequencyMatrix() {
        return Array.from({ length: this.MATRIX_SIZE }, () =>
            Array.from({ length: this.MATRIX_SIZE }, () => 0)
        );
    }

    static isValidAge(age) {
        return Number.isInteger(age) && age >= this.MIN_AGE && age <= this.MAX_AGE;
    }

    static registerMarriage(matrix, manAge, womanAge) {
        const rowIndex = manAge - this.MIN_AGE;
        const colIndex = womanAge - this.MIN_AGE;
        matrix[rowIndex][colIndex]++;
    }

    static getMostFrequentManAge(matrix) {
        let maxCount = 0;
        let bestAgeIndex = -1;

        matrix.forEach((row, i) => {
            const rowSum = row.reduce((acc, val) => acc + val, 0);
            if (rowSum > maxCount) {
                maxCount = rowSum;
                bestAgeIndex = i;
            }
        });

        return bestAgeIndex !== -1 ? bestAgeIndex + this.MIN_AGE : -1;
    }

    static getMostFrequentWomanAge(matrix) {
        let maxCount = 0;
        let bestAgeIndex = -1;

        for (let j = 0; j < this.MATRIX_SIZE; j++) {
            let colSum = 0;
            for (let i = 0; i < this.MATRIX_SIZE; i++) {
                colSum += matrix[i][j];
            }
            if (colSum > maxCount) {
                maxCount = colSum;
                bestAgeIndex = j;
            }
        }

        return bestAgeIndex !== -1 ? bestAgeIndex + this.MIN_AGE : -1;
    }

    static getMostFrequentCombination(matrix) {
        let maxCount = 0;
        let bestManAgeIndex = -1;
        let bestWomanAgeIndex = -1;

        for (let i = 0; i < this.MATRIX_SIZE; i++) {
            for (let j = 0; j < this.MATRIX_SIZE; j++) {
                if (matrix[i][j] > maxCount) {
                    maxCount = matrix[i][j];
                    bestManAgeIndex = i;
                    bestWomanAgeIndex = j;
                }
            }
        }

        if (bestManAgeIndex !== -1 && bestWomanAgeIndex !== -1) {
            return [bestManAgeIndex + this.MIN_AGE, bestWomanAgeIndex + this.MIN_AGE];
        }

        return [-1, -1];
    }
}