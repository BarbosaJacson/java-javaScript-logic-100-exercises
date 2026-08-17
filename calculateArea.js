"use strict"

const readline = require("readline");
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Enter the Length of the rectangle: ", (baseInput) => {
    rl.question("Enter the width of the rectangle: ", (alturaInput) => {
        const base = parseFloat(baseInput);
        const altura = parseFloat(alturaInput);
        const area = base * altura;
        console.log(`The area of the rectangle is: ${area}`);
        rl.close();
    });
});

