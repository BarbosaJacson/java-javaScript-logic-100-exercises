const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');

async function main() {
    const rl = createInterface({ input: stdin, output: stdout });
    const numero = Number(await rl.question("Digite um número inteiro:"));
    if (isNaN(numero) || numero < 0) {
        console.log(`ERROR:Digite um número inteiro.`);
        rl.close();
        return;
    }

    let sumDivisor = 0;

    for (let i = 1; i < numero; i++) {
        if (numero % i == 0) {

            sumDivisor += i;
        }

    }
    if (numero == sumDivisor) {
        console.log(`O numero ${numero} é perfeito.`);

    } else {
        console.log(`O numero ${numero} não é perfeito.`);

    }
    rl.close();
}
main();