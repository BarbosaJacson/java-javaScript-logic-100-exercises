const { stdin, stdout } = require("node:process");
const { createInterface } = require("node:readline/promises");


const calcularSomaMatriz =(resposta) => {

    if (!matriz || !Array.isArray(matriz) || matriz.length === 0) {
        return { somaLinhas: [], somaColunas: [] };
    }
    const linhas = matriz.length;
    const colunas = matriz[0].length;

    const somaLinhas = new Array(linhas).fill(0);
    const somaColunas = new Array(colunas).fill(0);

    for (let i = 0; i < linhas; i++) {
        for (let j = 0; j < colunas; j++) {
            somaLinhas[i] += matriz[i][j];
            somaColunas[j] += matriz[i][j];
        }
    }
    return { somaLinhas, somaColunas };
};

async function main(){
    const rl = createInterface({input:stdin, output:stdout});
    const matrizA = Array.from({ length: 5 }, () => Array(5).fill(0));

    for (let i = 0; i < 5; i++) {
        for (let j = 0; j < 5; j++) {
            const resposta = await rl.question(`Digite o valor para a posição [${i}][${j}]: `);
            matrizA[i][j] = parseInt(resposta, 10) || 0;
        }
    }
    const { somaLinhas, somaColunas } = calcularSomasMatriz(matrizA);

    console.log("Soma das Linhas:", somaLinhas);
    console.log("Soma das Colunas:", somaColunas);

    rl.close();
}

main();

