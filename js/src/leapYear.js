const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');

async function main() {

    const rl = createInterface({ input: stdin, output: stdout });
    const ano = Number(await rl.question("Digite qualquer ano: "));

    if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {

        console.log(`O ano é bissexto.`);
    } else {

        console.log(`O ano não é bissexto.`)
    }
    rl.close();

}
main();