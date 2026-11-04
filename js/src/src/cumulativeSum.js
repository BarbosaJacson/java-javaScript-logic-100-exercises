const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');

async function main() {

    const rl = createInterface({ input: stdin, output: stdout });
    let soma = 0;
    for (let i = 0; i <= 100; i++) {
        soma = soma + i;
        console.log(`${i}, ${soma} `)
    }
    rl.close();

}
main();