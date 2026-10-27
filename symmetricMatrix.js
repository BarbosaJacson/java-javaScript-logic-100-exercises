const { stdin, stdout } = require("node:process");
const { createInterface } = require("node:readline/promises");

const ehMatrizSimetrica = (matriz) => {
    if (!matriz || !Array.isArray(matriz) || matriz.length === 0) {
        return false;
    }
    if (matriz.length !== matriz[0].length) {
        return false;
    }
    for (let i = 0; i < matriz.length; i++) {
        for (let j = i + 1; j < matriz[i].length; j++) {
            if (matriz[i][j] !== matriz[j][i]) {
                return false;
            }
        }
    }
    return true;
}
async function main() {
    const rl = createInterface({ input: stdin, output: stdout });
    const matriz = Array.from({ length: 5 }, () => Array(5).fill(0));

    for (let i = 0; i < 5; i++) {
        for (let j = 0; j < 5; j++) {
            matriz[i][j] += parseInt(await rl.question("Digite um número inteiro: ")), 10 || 0;

        }

    }
    const resultado = ehMatrizSimetrica(matriz);
    console.log(`A matriz é simétrica? ${resultado}`);
    rl.close();

}
main();