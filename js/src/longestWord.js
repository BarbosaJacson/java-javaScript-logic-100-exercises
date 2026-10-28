const { stdin, stdout } = require("node:process");
const { createInterface } = require('node:readline/promises');

const maiorPalavra = (textoOriginal) => {
    if (!textoOriginal || typeof textoOriginal !== 'string') {
        return "";
    }
    const textoNormalizado = textoOriginal.trim().replace(/\s+/g, ' ');
    if (textoNormalizado === "") {
        return ""
    }

    const palavras = textoNormalizado.split(' ');

    return palavras.reduce(
        (maior, palavra) => (palavra.length > maior.length ? palavra : maior),
        ""
    );
}

async function main() {
    const rl = createInterface({ input: stdin, output: stdout })
    const textoOriginal = await rl.question("Digite uma frase ou texto: ");

    if (!textoOriginal || textoOriginal.trim() === "") {
        console.log("ERROR! Digite um texto válido!!");
        rl.close();
        return;
    }

    const retorno = maiorPalavra(textoOriginal);
    console.log(`A maior palavra do texto é: ${retorno}`);
    rl.close();
}
main();