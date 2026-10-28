const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');

async function main() {
    const rl = createInterface({ input: stdin, output: stdout });
    let vetorUm = new Array(10);
    let vetorDois = new Array(10);
    let vetorSoma = new Array(10);

    for (let i = 0; i < vetorUm.length; i++) {
        vetorUm[i] = Number(await rl.question(`Digite o ${i + 1}º número do vetor nº 1:`));
        if (isNaN(vetorUm[i])) {
            console.log("ERROR!! Digite um número inteiro válido!");
            rl.close();
            return;
        }

        vetorDois[i] = Number(await rl.question(`Digite o ${i + 1}º número do vetor nº 2:`));
        if (isNaN(vetorDois[i])) {
            console.log("ERROR!! Digite um número inteiro válido!");
            rl.close();
            return;
        }

        vetorSoma[i] = vetorUm[i] + vetorDois[i];
    }
    console.log(`O Vetor soma é composto por: ${vetorSoma}`);
    rl.close();
}
main();
