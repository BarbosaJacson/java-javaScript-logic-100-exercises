const { createInterface } = require("node:readline/promises");
const { stdin, stdout } = require("node:process");

async function main() {

    const rl = createInterface({ input: stdin, output: stdout });
    const rawInput = await rl.question("Quantos números irá digitar? ")
    const qtde = Number(rawInput);
    let maior = -Infinity;
    for (let i = 0; i < qtde; i++) {
        const input = await rl.question("Digite um número: ");
        const numeros = Number(input);
        if (numeros > maior) {
            maior = numeros;
        }

    }

    console.log(`O número maior é ${maior}`);
    rl.close();
}
main();