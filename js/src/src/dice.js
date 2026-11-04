const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');


async function main() {

    const rl = createInterface({ input: stdin, output: stdout });

    const numero = Number(await rl.question("Digite o valor correspondente a soma dos dois dados(1 - 12): "));
    if (numero > 12 || numero < 2) {
        console.log(`ERROR: Digite um valor válido entre 1 e 12`);
        rl.close();
        return;
    }
    let dadoA = 0;
    let dadoB = 0;

    for (let i = 1; i <= 6; i++) {
        dadoA = i;
        dadoB = numero - i;

        if ((dadoA >= 1 && dadoA < 7) && (dadoB >= 1 && dadoB < 7)) {
            console.log(`${dadoA}, ${dadoB}`)
        }

    }
    rl.close();
}
main();
