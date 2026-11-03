const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');

async function main() {
    let somaTotal = 0.0;
    let somaMenores = 0.0;
    let maior = -Infinity;
    let mediaPonderada = 0.0;
    let peso = 2.5;
    let pesoMaior = 5;
    const rl = createInterface({ input: stdin, output: stdout });
    const qtde = Number(await rl.question("Digite quantas notas irá inserir: "));

    for (let i = 1; i <= qtde; i++) {
        const notas = Number(await rl.question(`Digite a ${i}º nota: `));
        somaTotal += notas;

        if (notas > maior) {
            maior = notas;

        }

    }

    somaMenores = somaTotal - maior;
    mediaPonderada = ((somaMenores * peso) + (maior * pesoMaior)) / (((qtde - 1) * peso) + pesoMaior);
    console.log(`A média ponderada das notas é de ${mediaPonderada}`);
    rl.close();

}

main();