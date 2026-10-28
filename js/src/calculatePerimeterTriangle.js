'use strict'

const readLine = require("readline");
const rl = readLine.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Enter the Length of the triangle: ", (sideAInput) => {
    const Length = parseFloat(sideAInput);
    rl.question("Enter the Width of the triangle: ", (sideBInput) => {
        const Width = parseFloat(sideBInput);
        rl.question("Enter the Height of the triangle: ", (sideCInput) => {
            const Height = parseFloat(sideCInput);
            const perimeter = Length + Width + Height;

            console.log(`The perimeter of the triangle is: ${perimeter.toFixed(2)}`);
            rl.close();
        });
    });
});

