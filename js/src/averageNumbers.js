const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');

async function main() {

    const rl = createInterface({ input: stdin, output: stdout });
    const qtde = Number(await rl.question("Quantos números irá digitar? "));
    let soma = 0;
    let media = 0;
    for (let i = 1; i <= qtde; i++) {
        const numero = Number(await rl.question(`Digite o ${i}º número:`));
        soma += numero;
    }
    media = soma / qtde;
    console.log(media.toFixed(2));
    rl.close();

}
main();