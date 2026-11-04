'use strict'

const readline = require("readline");
const rl = readline.createInterface({
input: process.stdin,
output: process.stdout

});


rl.question("Digite a temperatura em Fahrenheit: ", (fahrenheit) =>{
const temperatura = parseFloat(fahrenheit);

const celsius = (5/9)*(fahrenheit - 32);

console.log(`A temperatura em celsius é: ${celsius.toFixed(2)} ºC`)
rl.close();

});