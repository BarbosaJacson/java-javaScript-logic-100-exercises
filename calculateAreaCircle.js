'use strict'

const readLine = require("readline");
const rl = readLine.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Enter the radius of the circle: ", (radiusInput) => {
    const radius = parseFloat(radiusInput);
    const area = Math.PI * (Math.pow(radius, 2));
    const perimeter = 2 * Math.PI * radius;

    console.log(`The area of the circle is: ${area.toFixed(2)}`);
    console.log(`The perimeter of the circle is: ${perimeter.toFixed(2)}`);
    rl.close();
});
