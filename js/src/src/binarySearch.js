const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');

async function main() {
    const rl = createInterface({ input: stdin, output: stdout });

    const vetor = Array.from({ length: 10 }, () => Math.floor(Math.random() * 20) + 1);
    vetor.sort((a, b) => a - b);
    console.log(`${vetor}`);

    const numero = Number(await rl.question("Digite um númento inteiro: "));
    if (isNaN(numero)) {
        console.log("ERROR!! Digite um número inteiro!!");
        rl.close();
        return;
    }

    function binarySearch(arr, target) {
        let inicio = 0, fim = arr.length - 1;
        while (inicio <= fim) {
            const meio = Math.floor((inicio + fim) / 2);
            if (arr[meio] === target) return meio;
            if (arr[meio] < target) inicio = meio + 1;
            else fim = meio - 1;
        }
        return -1;
    }

    const posicao = binarySearch(vetor, numero);

    const mensagem = posicao !== -1
        ? `Número encontrado na posição: ${posicao}`
        : "Valor não encontrado no vetor!";

    console.log(mensagem);

    rl.close();

}
main();