const { stdin, stdout } = require("node:process");
const { createInterface } = require("node:readline/promises");

const { linearizarMatriz } = require("../services/q95_linearizeMatrixService");

async function main() {
    const rl = createInterface({ input: stdin, output: stdout });
    const matriz = Array.from({ length: 6 }, () => Array(6).fill(0));
    for (let i = 0; i < matriz.length; i++) {
        for (let j = 0; j < matriz.length; j++) {
            const valorLido = await rl.question("Digite um número inteiro: ");
            matriz[i][j] = parseInt(valorLido, 10) || 0;
        }
    }

    const matrizLinearizada = linearizarMatriz(matriz);
    console.log("\nMatriz Linearizada:");
    console.table(matrizLinearizada);
    rl.close();
}
main();