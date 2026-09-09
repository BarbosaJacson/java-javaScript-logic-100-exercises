const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');

async function main() {

    const rl = createInterface({ input: stdin, output: stdout });
    const numero = Number(await rl.question("Digite um número inteiro: "));
    if(isNaN(numero) || numero <= 0){
        console.log(`Digite um número inteiro válido.`)
        rl.close();
        return;

    }

    let ultimo = 1;
    let penultimo = 0;
    let proximo = 0;
    for (let i = 1; i <= numero; i++) {
        console.log(`${ultimo}`);

        proximo = penultimo + ultimo;
        penultimo = ultimo;
        ultimo = proximo;
    }
    rl.close();

}
main();