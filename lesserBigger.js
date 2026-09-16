const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');

async function main() {

    const rl = createInterface({ input: stdin, output: stdout });
    let vetor = new Array(20);
    for (let i = 0; i < vetor.length; i++) {

        vetor[i] = Number(await rl.question(`Digite o ${i + 1}º número inteiro:`));
        if (isNaN(vetor[i])) {
            console.log("ERROR!! Digite um número inteiro.")
            rl.close();
            return;
        }
    }
    const maior = Math.max(...vetor);
    const menor = Math.min(...vetor);
    console.log(`Maior valor: ${maior}, e Menor valor: ${menor}.`);
    rl.close();
}
main();