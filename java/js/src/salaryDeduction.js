const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');


async function main() {

    const rl = createInterface({ input: stdin, output: stdout });
    let remuneracao = Number(await rl.question("Digite o valor do salário: "));

    let taxa = 0.11;
    let desconto = 0.0;
    let maxDesconto = 334.29;

    desconto = remuneracao * taxa;

    if (desconto > maxDesconto) {

        desconto = maxDesconto;
    }

    console.log(`O Salário com desconto é de ${(remuneracao - desconto).toFixed(2)}.`);
    console.log(`O desconto previdenciário é de ${desconto.toFixed(2)}`);

    rl.close();

}
main();