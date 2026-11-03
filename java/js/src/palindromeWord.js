const { stdin, stdout } = require("node:process");
const { createInterface } = require('node:readline/promises');

const palindromePalavra = (textoOriginal) => {
    if (!textoOriginal || typeof textoOriginal !== 'string') {
        return "";
    }
    const textoNormalizado = textoOriginal.trim().replace(/\s+/g, '').toLowerCase();
    if (textoNormalizado === "") {
        return ""
    }

    const textoInvertido = textoNormalizado.split('').reverse().join('');
    return (textoInvertido === textoNormalizado);
}

async function main() {
    const rl = createInterface({ input: stdin, output: stdout })
    const textoOriginal = await rl.question("Digite uma frase ou texto: ");

    if (!textoOriginal || textoOriginal.trim() === "") {
        console.log("ERROR! Digite um texto válido!!");
        rl.close();
        return;
    }

    const retorno = palindromePalavra(textoOriginal);
    console.log(`O inverso do texto é igual? ${retorno}`);
    rl.close();
}
main();