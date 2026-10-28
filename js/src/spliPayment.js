'use strict'

const { stdin, stdout } = require('process')
const readline = require('readline')
const rl = readline.createInterface({
    input: stdin,
    output: stdout

});

rl.question("Digite o valor da compra: ", (valorInput) => {

    let compra = parseFloat(valorInput);

    let inteiro = Math.floor(compra);
    let parcelas = Math.floor(inteiro / 3);
    let entrada = compra - (parcelas * 2);

    console.log(`A entrada é de: ${entrada.toFixed(2)}`);
    console.log(`As duas parcelas são de: ${parcelas.toFixed(2)} cada.`);
    rl.close();
});