const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');

async function main() {
    const rl = createInterface({ input: stdin, output: stdout });
    let vetor = new Array(10);
    let contador = 0;
    for (let i = 0; i < vetor.length; i++) {
        vetor[i] = Number(await rl.question(`Digite o ${i+1}º número: `));
        if (vetor[i] % 2 == 0) {
            contador++;
        }

    }
    console.log(`${contador}`);
    rl.close();
}
main();
