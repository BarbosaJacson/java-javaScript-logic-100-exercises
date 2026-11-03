const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');

async function main() {

    const rl = createInterface({ input: stdin, output: stdout });
    const vetor = new Array(15);
    for (let i = 0; i < vetor.length; i++) {

        vetor[i] = Number(await rl.question(`Digite o ${i + 1}º número do vetor: `));
        if (isNaN(vetor[i])) {
            console.log(`ERROR!! Digite um número inteiro válido!!`);
            rl.close();
            return;
        }
    }
    const numero = Number(await rl.question(`Digite um número contido no vetor: `));
    if (isNaN(numero)) {
        console.log(`ERROR!! Digite um número inteiro contido no vetor!!`);
        rl.close();
        return;
    }

    const repeticoes = vetor.filter(n => n === numero).length;
    console.log(`O número ${numero} aparece ${repeticoes} vezes.`)

    rl.close();
}
main();

