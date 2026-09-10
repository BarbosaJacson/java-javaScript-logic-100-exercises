const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');


async function main() {
    const rl = createInterface({ input: stdin, output: stdout });
    const numero = Number(await rl.question("Digite um númento inteiro válido: "));
    if (isNaN(numero) || numero <= 0) {
        console.log("Erro: Digite um número inteiro válido e maior que zero!");
        rl.close();
        return;
    }

    let produto = 0;
    let i = 1;

    while (i * (i + 1) * (i + 2) < numero) {
        i++;
    }
    produto = (i * (i + 1) * (i + 2));
    if (produto == numero) {
        console.log(`O número ${numero} é triangular. (${i}* ${i + 1} * ${i + 2})`);
    } else {
        console.log(`O número ${numero} não é triangular.`);
    }
    rl.close();

}
main();