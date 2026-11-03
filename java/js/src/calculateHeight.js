'use strict'

const readline = require('readline')
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Digite sua altura: ", (alturaInput)=>{
    rl.question("Digite sua sombra: ", (sombraInput)=>{
        rl.question("Digite a sombra do prédio: ", (predioInput)=>{
            const minhaSombra = parseFloat(sombraInput);
            const altura = parseFloat(alturaInput);
            const sombraPredio = parseFloat(predioInput);

            const alturaPredio = (altura * sombraPredio) / minhaSombra

            console.log(`A altura do prédio é de: ${alturaPredio.toFixed(2)}`);
            rl.close();

        });
    });
});