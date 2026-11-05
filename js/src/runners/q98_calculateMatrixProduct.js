import { MatrixMultiplicationService } from '../services/q98_matrixMultiplicationService.js';

function main() {
    
    const matrixA = [
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9],
        [10, 11, 12]
    ];

    const matrixB = [
        [1, 2],
        [3, 4],
        [5, 6]
    ];
    console.log("=== MATRIZ A (4x3) ===");
    console.log(MatrixMultiplicationService.formatMatrix(matrixA));
    console.log("\n=== MATRIZ B (3x2) ===");
    console.log(MatrixMultiplicationService.formatMatrix(matrixB));

    const resultMatrix = MatrixMultiplicationService.multiply(matrixA, matrixB);

    console.log("\n=== MATRIZ RESULTANTE C (4x2) ===");
    console.log(MatrixMultiplicationService.formatMatrix(resultMatrix));
    
}

main();