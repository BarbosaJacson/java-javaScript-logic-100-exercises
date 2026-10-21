const { stdin, stdout } = require("node:process");
const { createInterface } = require("node:readline/promises");

const compareStrings = (primeiraPalavra, segundaPalavra) => {
    if ((!primeiraPalavra || typeof primeiraPalavra !== 'string') || (!segundaPalavra || typeof segundaPalavra !== 'string')) {
        return -1;
    }

    const primeiraLimpa = primeiraPalavra.trim();
    const segundaLimpa = segundaPalavra.trim();
    return primeiraLimpa.toLowerCase() === segundaPalavra.toLowerCase();
}

async function main() {
    const rl = createInterface({ input: stdin, output: stdout });
    const primeiraPalavra = await rl.question("Digite a primeira palavra: ");
    if (!primeiraPalavra || primeiraPalavra.trim() === "") {
        console.log("ERROR! Digite uma palavra válida!!");
        rl.close();
        return;
    }
    const segundaPalavra = await rl.question("Digite a segunda palavra: ");
    if (!segundaPalavra || segundaPalavra.trim() === "") {
        console.log("ERROR! Digite uma palavra válida!!");
        rl.close();
        return;
    }
    const retorno = compareStrings(primeiraPalavra, segundaPalavra);
    console.log(`As duas palavras são inguais? R: ${retorno}`);
    rl.close();
}
main();