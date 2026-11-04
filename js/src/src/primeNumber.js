const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');

async function main() {

    const rl = createInterface({ input: stdin, output: stdout });
    const numero = Number(await rl.question("Digite um número: "));
    let ehPrimo = true;
    if (numero <= 1) {
        ehPrimo = false;
    }

    for (let i = 2; i <= (numero - 1); i++) {

        if (numero % i == 0) {
            ehPrimo = false;
            break;
        }
    }

    if (ehPrimo) {
        console.log(`O número é primo`);
    } else {
        console.log(`O número não é primo.`)
    }
    rl.close();
}
main();