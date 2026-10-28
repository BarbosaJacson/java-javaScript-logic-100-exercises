'use strict'

const readline = require('readline')
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Digite o valor que irá sacar: ", (saqueInput) => {
    let saque = parseFloat(saqueInput);
    let notas = [100, 50, 20, 10, 5, 2, 1];
    let qtdeNotas = 0;

    for (let i = 0; i < notas.length; i++) {

        qtdeNotas = Math.floor(saque / notas[i]);
        saque = saque % notas[i];
        if (qtdeNotas > 0) {
            console.log(`Teremos ${qtdeNotas} nota(s) de ${notas[i]},00`);
        }
    }
    rl.close();
});