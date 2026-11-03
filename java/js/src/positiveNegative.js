'use strict'

const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');



async function main() {
    const input = await rl.question("Digite um numero: ");
    const a = Number(input);

    if (a < 0) {

        console.log(`O número ${a} é negativo.`);
    } else if (a == 0) {
        console.log(`O número ${a} é neutro.`);

    } else {

        console.log(`O número ${a} é positivo.`);
    }
    rl.close();
}

main();

