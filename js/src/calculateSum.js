const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');

async function main() {

    const rl = createInterface({ input: stdin, output: stdout });
    const numero = Number(await rl.question("Digite um numero inteiro: "));
    if (isNaN(numero) || numero <= 0) {
        console.log("ERROR: Digite um número inteiro!!");
        rl.close();
        return;

    }

    let resultado = 0.0;
    for (let i = 1; i <= numero; i++) {

        resultado += 1.0 / Math.pow(i, i);

    }

    console.log(`O valor de S é ${resultado.toFixed(2)}`);
    rl.close();
}
main();