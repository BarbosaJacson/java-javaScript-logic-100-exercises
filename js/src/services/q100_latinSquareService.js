export class LatinSquareService {

    static isLatinSquare(matrix) {
        if (!Array.isArray(matrix) || matrix.length === 0) {
            return false;
        }

        const n = matrix.length;

        for (let i = 0; i < n; i++) {
            if (!Array.isArray(matrix[i]) || matrix[i].length !== n) {
                return false;
            }
        }

        for (let i = 0; i < n; i++) {
            if (!this.isValidRow(matrix, i, n)) {
                return false;
            }
        }

        for (let j = 0; j < n; j++) {
            if (!this.isValidColumn(matrix, j, n)) {
                return false;
            }
        }

        return true;
    }

    static isValidRow(matrix, row, n) {
        const seen = new Array(n + 1).fill(false);

        for (let j = 0; j < n; j++) {
            const value = matrix[row][j];

            if (!Number.isInteger(value) || value < 1 || value > n || seen[value]) {
                return false;
            }

            seen[value] = true;
        }

        return true;
    }

    static isValidColumn(matrix, col, n) {
        const seen = new Array(n + 1).fill(false);

        for (let i = 0; i < n; i++) {
            const value = matrix[i][col];

            if (!Number.isInteger(value) || value < 1 || value > n || seen[value]) {
                return false;
            }

            seen[value] = true;
        }

        return true;
    }
}