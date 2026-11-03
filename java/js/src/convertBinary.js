'use strict'
const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Digite um número binário: ", (binaryInput) =>{
let inteiro = parseInt(binaryInput);
const lista = [];

while (inteiro > 0){

    const resto = inteiro % 2;
    lista.push(resto);
    inteiro = Math.floor(inteiro / 2)
    

};

console.log(`O número binário ${binaryInput} convertido para decimal é: ${lista.reverse().join('')}`);
rl.close();
});
