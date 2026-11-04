'use strict'

const readline = require('readline')
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout

});

rl.question("Digite o raio do cilindro:  ", (raioInput) => {
    rl.question("Digite a altura do cilindro:  ", (alturaInput) => {
        const raio = parseFloat(raioInput);
        const altura = parseFloat(alturaInput);

        const vol = Math.PI * (Math.pow(raio, 2)) * altura;

        console.log(`O volume do cilindro é: ${vol.toFixed(2)}`);
        rl.close();

    });
});