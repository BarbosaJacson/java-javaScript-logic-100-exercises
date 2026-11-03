const { stdin, stdout } = require("node:process");
const { createInterface } = require("node:readline");

async function main() {

    const rl = createInterface({ input: stdin, output: stdout });
    const tamanho = 15;
    const listDesordenada = Array.from({ length: tamanho }, () => Math.floor(Math.random() * tamanho + 1));

    console.log(`Lista desordenada: ${listDesordenada}`);

    const listOrdenada = listDesordenada.toSorted((a, b) => a - b);
    console.log(`Lista Ordenada: ${listOrdenada}`);

    rl.close();

}
main();