'use strict'

const readline = require('readline')
const rl = readline.createInterface({

    input: process.stdin,
    output: process.stdout
});

rl.question("Digite o valor de a: ", (valorAInput) => {
    rl.question("Digite o valor de b: ", (valorBInput) => {
        const a = parseFloat(valorAInput);
        const b = parseFloat(valorBInput);
        let x = 0;
        let equation = 0;

        if (a !== 0) {

            equation = (b * -1) / a
            console.log(`O resultado da equação é ${equation.toFixed(2)}`)
        } else {
            console.log("Valor de A não pode ser igual a zero em uma equação de 1º grau.")           
        }
        rl.close();
    })
})