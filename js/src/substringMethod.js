const { stdin, stdout } = require("node:process");
const { createInterface } = require("node:readline/promises");

const extrairSubstring = (textoOriginal, indiceInicial, indiceFinal) => {

    if (!textoOriginal || typeof textoOriginal !== 'string') {
        return "";
    }

    if (indiceInicial < 0 || indiceFinal > textoOriginal.length || indiceInicial > indiceFinal) {
        return "";
    }
    return textoOriginal.slice(indiceInicial, indiceFinal);
}
async function main() {
    const rl = createInterface({ input: stdin, output: stdout });
    const textoOriginal = await rl.question("Digite uma palavra ou texto: ");
    
    const entradaInicial = await rl.question(`Digite um indice entre 0 e ${textoOriginal.length}`);
    const indiceInicial = Number(entradaInicial.trim());
    
    const entradaFinal = await rl.question(`Digite um indice entre ${indiceInicial} e ${textoOriginal.length}`);
    const indiceFinal = Number(entradaFinal.trim());
    
    const resultado = extrairSubstring(textoOriginal, indiceInicial, indiceFinal);
    console.log(`O Substring do ${textoOriginal} que começa em ${indiceInicial} e termina em ${indiceFinal} é: ${resultado}`);

    rl.close();
}
main();
