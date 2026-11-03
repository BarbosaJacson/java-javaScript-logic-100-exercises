'use strict'

const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');

async function main() {
    const rl = createInterface({ input: stdin, output: stdout });
    const rawInput = await rl.question("Digite um numero: ");

    if (rawInput % 2 == 0) {
        console.log(`O numero ${rawInput} é par.`);

    } else {

        console.log(`O numero ${rawInput} é impar.`);
    }
    rl.close();

}

main();