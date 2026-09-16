const { createInterface } = require('node:readline/promises');
const { stdin, stdout} = require('node:process');

async function main() {
    const rl = createInterface({ input: stdin, output: stdout });

    const vetor = new Array(10);
    
    for (let i = 0; i < vetor.length; i++) {
        vetor[i] = Number(await rl.question(`Digite o ${i + 1}º número: `));
        if (isNaN(vetor[i])) {
            console.log("ERROR!! Digite um número inteiro!!");
            rl.close();
            return;
        }
    }
    const vetorCopia = [...vetor];
    console.log(`${vetorCopia}`);
    rl.close();
}
main();