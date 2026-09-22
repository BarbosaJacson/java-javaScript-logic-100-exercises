const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');


async function main() {
    const rl = createInterface({ input: stdin, output: stdout });
    const vetor = Array.from({ length: 10 }, () => Math.floor(Math.random() * 20) + 1);

    console.log(`${vetor}`);

    const numero = Number(await rl.question("Digite um número inteiro: "));
    let posicao = vetor.findIndex(v => v === numero);
    console.log(`Posição: ${posicao}.`);

    rl.close();

}
main();