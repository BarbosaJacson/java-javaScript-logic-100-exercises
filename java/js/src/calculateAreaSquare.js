"use strict"

const readline = require("readline");
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Enter the Length of the square: ", (LengthInput) => {
    const Length = parseFloat(LengthInput);
    const area = Length * Length;
    const perimeter = 4 * Length;
    console.log(`The area of the square is: ${area}`);
    console.log(`The perimeter of the square is: ${perimeter}`);
    rl.close();
});


