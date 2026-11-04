const { stdin, stdout } = require("node:process");
const { createInterface } = require("node:readline/promises");

const contarOcorrencias = (textoOriginal, entradaAlvo) => {
    if (!textoOriginal || typeof textoOriginal !== 'string' || !entradaAlvo || typeof entradaAlvo !== 'string') {
        return 0;
    }
    const texto = textoOriginal.toLowerCase();
    const alvo = entradaAlvo.toLowerCase()[0];
    const total = [...texto].filter(c => c == alvo).length;
    return total;
}
async function main() {
    const rl = createInterface({ input: stdin, output: stdout });
    const textoOriginal = await rl.question("Digite uma palavra ou texto: ");
    if (!textoOriginal || textoOriginal.trim() === "") {
        console.log("ERROR!! Entrada Inválida!!")
        rl.close();
        return
    }
    console.log(textoOriginal);
    const entradaAlvo = await rl.question("Digite um caracter contido no texto ou palavra: ");
    if (!entradaAlvo || entradaAlvo.trim() === "") {
        console.log("ERROR!! Entrada Inválida!!")
        rl.close();
        return
    }
    console.log(entradaAlvo);

    const total = contarOcorrencias(textoOriginal, entradaAlvo);
    console.log(`O caractere '${entradaAlvo.trim()[0]}' aparece ${total} vez(es) no texto.`);
    rl.close();
}
main();