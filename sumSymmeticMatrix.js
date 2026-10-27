const { stdin, stdout } = require("node:process");
const { createInterface } = require("node:readline/promises");

const calcularSomasDiagonais = (matriz) => {
    if (!matriz || !Array.isArray(matriz) || matriz.length === 0) {
       return { somaPrincipal: 0, somaSecundaria: 0 };
    }
    const n = matriz.length;
    let somaPrincipal = 0;
    let somaSecundaria = 0;
    for (let i = 0; i < n; i++) {
        somaPrincipal += matriz[i][i];
        somaSecundaria += matriz[i][n - 1 - i];
    }
    return { somaPrincipal, somaSecundaria };
}
async function main() {
    const rl = createInterface({ input: stdin, output: stdout });
    const matriz = Array.from({ length: 5 }, () => Array(5).fill(0));

    for (let i = 0; i < 5; i++) {
        for (let j = 0; j < 5; j++) {
            matriz[i][j] += parseInt(await rl.question("Digite um número inteiro: "), 10) || 0;

        }

    }
    const resultado = calcularSomasDiagonais(matriz);
    console.log(`O resultado da soma diagonal é: ${resultado.somaPrincipal} e ${resultado.somaSecundaria}`);
    rl.close();

}
main();