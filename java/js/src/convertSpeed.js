'use strict'

const readline = require('readline')
const rl = readline.createInterface({
input: process.stdin,
output: process.stdout
})

rl.question("Digite a velocidade em m/s: ", (velocidadeInput)=>{
    const velocidadeMs = parseFloat(velocidadeInput);
    const velocidadeKm = velocidadeMs * 3.6;

    console.log(`A velocidade em KM é: ${velocidadeKm.toFixed(2)}`)
    rl.close();
});