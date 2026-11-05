import readline from 'node:readline/promises';
import { stdin as input, stdout as output } from 'node:process';
import { LatinSquareService } from '../services/q100_latinSquareService.js';

async function main() {
    const rl = readline.createInterface({ input, output });

    const nInput = await rl.question("Digite a ordem N da matriz: ");
    const n = Number(nInput);

    if (!Number.isInteger(n) || n <= 0) {
        console.log("Entrada inválida. Encerramento Fail-Fast.");
        rl.close();
        return;
    }

    const matrix = Array.from({ length: n }, () => Array(n).fill(0));

    for (let i = 0; i < n; i++) {
        for (let j = 0; j < n; j++) {
            const valInput = await rl.question(`Digite o elemento [${i}][${j}]: `);
            const val = Number(valInput);

            if (!Number.isInteger(val)) {
                console.log("Entrada inválida. Encerramento Fail-Fast.");
                rl.close();
                return;
            }

            matrix[i][j] = val;
        }
    }

    rl.close();

    const isLatin = LatinSquareService.isLatinSquare(matrix);

    if (isLatin) {
        console.log(`A matriz fornecida É um Quadrado Latino de Ordem ${n}.`);
    } else {
        console.log(`A matriz fornecida NÃO É um Quadrado Latino de Ordem ${n}.`);
    }
}

main();