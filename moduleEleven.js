const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');

async function main() {
    const rl = createInterface({ input: stdin, output: stdout });
    
    const conta = await rl.question("Digite o número da conta (4 dígitos): ");

    if (conta.length !== 4) {
        console.log("ERROR: O número da agência deve ter exatamente 4 dígitos!!");
        rl.close();
        return;
    }

    const d1 = conta[0] * 5;
    const d2 = conta[1] * 4;
    const d3 = conta[2] * 3;
    const d4 = conta[3] * 2;

    const soma = d1 + d2 + d3 + d4;
    const resto = soma % 11;
    const dv = 11 - resto;

    let dvResultado;
    if (dv === 10) {
        dvResultado = "X";
    } else if (dv === 11) {
        dvResultado = "0";
    } else {
        dvResultado = String(dv);
    }

    console.log(`Agência completa: ${conta}-${dvResultado}`);

    rl.close();
}

main();