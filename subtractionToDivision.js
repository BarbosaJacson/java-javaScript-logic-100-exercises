const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');

async function main() {

    const rl = createInterface({ input: stdin, output: stdout });

    let numero = Number(await rl.question("Digite um número inteiro: "));
    if (!Number.isInteger(numero)) {
        console.log("Erro: Digite um número inteiro válido!");
        rl.close();
        process.exit(1);
    }
    let divisor = Number(await rl.question("Digite um número inteiro: "));
        if (!Number.isInteger(divisor)) {
            console.log("Erro: Digite um número inteiro válido!");
            rl.close();
            process.exit(1);
    }
    if (numero < 0 || divisor <= 0) {
    console.log("Erro: Os números devem ser positivos e o divisor maior que zero!");
    rl.close();
    process.exit(1);
}

        while (divisor <= numero) {

            numero = numero - divisor;
        }
        let resto = numero;
        console.log(`${resto}`);

        rl.close();

    }
    
    main();
