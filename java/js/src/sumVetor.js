const { createInterface } = require('node:readline/promises');
const { stdin, stdout} = require('node:process');

async function main() {
    const rl = createInterface({ input: stdin, output: stdout });

    const vetor = new Array(10);
    const vetorDois = Array(10);
    
    
    for (let i = 0; i < vetor.length; i++) {
        vetor[i] = Number(await rl.question(`Digite o ${i + 1}º número do vetor um: `));
        if (isNaN(vetor[i])) {
            console.log("ERROR!! Digite um número inteiro!!");
            rl.close();
            return;
        }
    }
    for (let i = 0; i < vetorDois.length; i++) {
        vetorDois[i] = Number(await rl.question(`Digite o ${i + 1}º número do vetor dois: `));
        if (isNaN(vetorDois[i])) {
            console.log("ERROR!! Digite um número inteiro!!");
            rl.close();
            return;
        }
    }
    
    const vetorTres = vetor.map((valor, i) => Math.max(valor, vetorDois[i]));
    console.log(`Vetor com os maiores valores: [${vetorTres.join(', ')}]`);
    rl.close();
}
main();