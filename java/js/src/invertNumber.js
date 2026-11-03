'use strict'

const readline = require("readline")
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout

});


rl.question("Digite um número inteiro: ", (numeroInput) => {
    let numero = parseInt(numeroInput);
    let invertido = 0;
    while (numero !== 0) {
        const ultimoDigito = numero % 10;
        invertido = parseInt((invertido * 10) + ultimoDigito);
        numero = Math.floor(numero / 10);

    }
    console.log(`O número invertido é: ${invertido}`);
    rl.close();

});