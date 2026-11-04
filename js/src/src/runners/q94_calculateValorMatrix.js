const { stdin, stdout } = require("node:process");
const { createInterface } = require("node:readline/promises");

const { calcularValorMatriz } = require("../services/q94_calculateValorMatrixService");
async function main() {
    const rl = createInterface({ input: stdin, output: stdout });
    const matriz = Array.from({ length: 6 }, () => Array(6).fill(0));
    for (let i = 0; i < matriz.length; i++) {
        for (let j = 0; j < matriz.length; j++) {
            matriz[i][j] = parseInt(await rl.question("Digite o proximo numero pra preencher a matriz: "), 10) || 0;
        }
    }
    const valorEscalar = Number(await rl.question("Digite um número multiplicador inteiro: "));
    if (isNaN(valorEscalar)) {
        console.log("ERROR!! Número inválido!");
        rl.close();
        return;
    }

    const matrizFinal = calcularValorMatriz(valorEscalar, matriz);
    console.log("\nMatriz recalculada (in-place):");
    console.table(matrizFinal);
    rl.close();
}
main();