'use strict'

const readLine = require("readline");
const rl = readLine.createInterface({
    input: process.stdin,
    output: process.stdout

});

rl.question("Digite o primeiro número: ", (remainderOne) => {
    rl.question("Digite o segundo número: ", (remainderTwo) => {

        const primeiroNumero = parseInt(remainderOne);
        const segundoNumero = parseInt(remainderTwo);

        const quociente = Math.floor(primeiroNumero / segundoNumero);
        const resto = (primeiroNumero % segundoNumero);

        console.log(`O quociente é :  ${quociente}`);
        console.log(`O resto é :  ${resto}`);
        rl.close();
    });
});