const { createInterface } = require('node: readline/promises');
const { stdin, stdout } = require('node: process');

const convertHexParaDecimal = (hexTexto) => {
    if (!hexTexto || typeof hexTexto !== 'string') {
        return -1;
    }
    const hexLimpo = hexTexto.trim().replace(/^0x/i, '');
    if (hexLimpo === "") {
        return -1;
    }

    const numeroDecimal = parseInt(hexLimpo, 16);
    if (Number.isNaN(numeroDecimal)) {
        return -1;
    }
    return numeroDecimal;

}

async function main() {
    const rl = createInterface({ input: stdin, output: stdout });
    const hexTexto = await rl.question("Digite um número hexadecimal (ex: 1A, FF, 2A3F): ");
    if (!hexTexto || hexTexto.trim() === "") {
        console.log("ERROR! Digite um número hexadecimal válido!!");
        rl.close();
        return;
    }

    const retorno = convertHexParaDecimal(hexTexto);
    if (retorno !== -1) {
        console.log(`O número decimal é  ${retorno}`);
    }
    else { console.log("Falha na conversão!!") };

    rl.close();

}
main();