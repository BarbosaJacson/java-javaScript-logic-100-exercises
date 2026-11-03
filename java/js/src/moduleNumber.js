'use strict'

const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');

async function main() {
    const rl = createInterface({ input: stdin, output: stdout });
    const rawInput = await rl.question("Digite um número: ");
    const modulo = Math.abs(Number(rawInput));

    console.log(`O módulo é:  ${modulo}`);
    rl.close();

}
main();