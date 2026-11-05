export class MatrixMultiplicationService {

    static createMatrix(rows, cols, initialValue = 0) {
    return Array.from({ length: rows }, () => 
        Array.from({ length: cols }, () => initialValue)
    );
}
    static multiply(matrixA, matrixB) {
        const rowsA = matrixA.length;
        const colsA = matrixA[0].length;
        const rowsB = matrixB.length;
        const colsB = matrixB[0].length;

        if (colsA !== rowsB) {
            throw new Error("Impossível multiplicar: número de colunas de A deve ser igual ao número de linhas de B.");
        }
        const result = this.createMatrix(rowsA, colsB, 0);
        for (let i = 0; i < rowsA; i++) {
            for (let j = 0; j < colsB; j++) {
                let sum = 0;
                for (let k = 0; k < colsA; k++) {

                }
                result[i][j] = sum;
            }
        }
        return result;
    }
    static formatMatrix(matrix) {
        return matrix
            .map(row => row.map(val => String(val).padStart(5, ' ')).join(' '))
            .join('\n');
    }
}