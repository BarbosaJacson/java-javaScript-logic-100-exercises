const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');


async function main() {
    const rl = createInterface({ input: stdin, output: stdout });

    let primeiro = Number(await rl.question("Digite o primeiro numero da série: "));
    let segundo = Number(await rl.question("Digite o segundo numero da serie: "));
    let qtde = Number(await rl.question("Digite a quantidade de numeros: "));
    if (isNaN(primeiro) || isNaN(segundo) || isNaN(qtde) || qtde < 3) {
        console.log("Erro: Digite valores numéricos válidos e uma quantidade de no mínimo 3!");
        rl.close();
        return;
    }
    console.log(`${primeiro},  ${segundo}`);
    let proximo = 0;
    for (let i = 3; i <= qtde; i++) {
        if (i % 2 == 0) {
            proximo = segundo - primeiro;
        } else {

            proximo = segundo + primeiro;
        }
        console.log(`${proximo}`);
        primeiro = segundo;
        segundo = proximo;

    }

    rl.close();

}
main();

