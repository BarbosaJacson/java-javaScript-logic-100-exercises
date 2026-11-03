const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');


async function main() {
    const rl = createInterface({ input: stdin, output: stdout });
    const renda = Number(await rl.question("Digite o valor da renda: "));
    const emprestimo = Number(await rl.question("Digite o valor do empréstimo: "));
    const qtde = Number(await rl.question("Digite a quantidade de parcelas: "));

    const limite = renda * 10;
    const parcelas = emprestimo / qtde;
    const valorMensal = renda * 0.3;

    if (emprestimo > limite || parcelas > valorMensal) {
        console.log("O empréstimo não foi aprovado, tente um valor menor.");

    } else {
        console.log("O empreéstimo foi aprovado.");
    }
    rl.close();
}
main();