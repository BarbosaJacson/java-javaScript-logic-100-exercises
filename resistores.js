'use strict'
const readline = require('readline')
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Digite o valor da R1: ", (r1Input) => {
    rl.question("Digite o valor de R2: ", (r2Input) => {
        rl.question("Digite o valor de R3: ", (r3Input) => {

            const R1 = parseFloat(r1Input);
            const R2 = parseFloat(r2Input);
            const R3 = parseFloat(r3Input);

            const R12 = (R1 * R2) / (R1 + R2);
            const Req = R12 + R3;

            console.log(`A resistencia equivalente é: ${Req.toFixed(2)}`)
            rl.close;
        });
    });
});