const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');

const { calcularSomaEDiferenca } = require('../services/q96_matrixOperationsService');
async function main() {
    const rl = createInterface({ input: stdin, output: stdout });

    const matrizA = Array.from({ length: 3 }, () => Array(4).fill(0));
    const matrizB = Array.from({ length: 3 }, () => Array(4).fill(0));
    for (let i = 0; i < matrizA.length; i++) {
        for (let j = 0; j < matrizA[i].length; j++) {
            const valorLido = await rl.question("Digite um número inteiro: ");
            matrizA[i][j] = parseInt(valorLido, 10) || 0;
        }
    }
        for (let k = 0; k < matrizB.length; k++) {
            for (let n = 0; n < matrizB[k].length; n++) {
                const valorLido = await rl.question("Digite um número inteiro: ");
                matrizB[k][n] = parseInt(valorLido, 10) || 0;
            }
        }
        const { soma, diferenca } = calcularSomaEDiferenca(matrizA, matrizB);

        console.log("\n--- Matriz Soma (3x4) ---");
        console.table(soma);

        console.log("\n--- Matriz Diferença (3x4) ---");
        console.table(diferenca);
    
    rl.close();
}
main();