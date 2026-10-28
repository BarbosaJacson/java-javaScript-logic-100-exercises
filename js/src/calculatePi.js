const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');

async function main() {

    const rl = createInterface({ input: stdin, output: stdout });
    const numero = Number(await rl.question('Digite um número inteiro:'));
    if (isNaN(numero) || numero < 0) {

        console.log("ERROR!! Digite um número inteiro.")
        rl.close();
        return;
    }
    let fracao = 0;
    let impar = 0;
    let termo = 0;

    for (let i = 1; i <= numero; i++) {
        impar = (2 * i - 1);
        fracao = 1.0 / (Math.pow(impar, 3));
        termo += (i % 2 != 0) ? fracao : - fracao;
    }
    console.log(`O valor de S é ${termo.toFixed(2)}`);
    rl.close();

}
main();