const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');

async function main() {
    const rl = createInterface({ input: stdin, output: stdout });
    const numero = Number(await rl.question("Digite um número entre 1 a 100: "));

    let numeroExtenso = "";
    let resto = 0;
    let dezena = 0;

    const unidades = ["", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"];
    const dezenas = ["", "dez", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"];
    const especiais = ["", "onze", "doze", "treze", "catorze", "quinze"];
    const dez = ["", "deze"];

    if (numero === 100) {
        numeroExtenso = "cem";
    } else if (numero >= 1 && numero <= 9) {
        numeroExtenso = unidades[numero];
    } else if (numero % 10 === 0) {
        dezena = numero / 10;
        numeroExtenso = dezenas[dezena];
    } else if (numero >= 11 && numero <= 15) {
        resto = numero % 10;
        numeroExtenso = especiais[resto];
    } else if (numero >= 16 && numero <= 19) {
        resto = numero % 10;
        // Une "deze" com "seis", "sete", "oito", "nove" (sem espaço no meio)
        numeroExtenso = `${dez[1]}${unidades[resto]}`;
    } else if (numero >= 21 && numero <= 99) {
        // Math.floor para truncar as casas decimais da divisão
        dezena = Math.floor(numero / 10);
        resto = numero % 10;
        numeroExtenso = `${dezenas[dezena]} e ${unidades[resto]}`;
    }

    console.log(numeroExtenso);
    rl.close();
}

main();