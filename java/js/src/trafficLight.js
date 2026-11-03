'use strict'

const readline = require('readline')
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Digita a distância entre os semaforos: ", (distanciaInput) => {
    rl.question("Digite a velocidade permitida da via: ", (velocidadeInput) => {
        rl.question("Digite a aceleração típica dos carros: ", (acelercaoInput) => {

            const distancia = parseFloat(distanciaInput);
            const aceleracao = parseFloat(acelercaoInput);
            const velocidadeMs = parseFloat(velocidadeInput) / 3.6;
            const t1 = velocidadeMs / aceleracao;
            const d1 = aceleracao * (Math.pow(t1, 2)) / 2;
            const d2 = distancia - d1;
            const t2 = d2 / velocidadeMs;
            const tempAbertura = (t1 + t2) - 3;

            console.log(`O tempo de abertura do próximo semaforo é de: ${tempAbertura.toFixed(2)}`)
            rl.close();

        });

    });

});