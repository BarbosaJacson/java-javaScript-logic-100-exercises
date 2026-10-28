const { stdin, stdout } = require("node:process");
const { createInterface } = require("node:readline/promises");

const normalizarTexto = (textoOriginal) => {
    if (!textoOriginal || typeof textoOriginal !== 'string') {
        return "";

    }
    return textoOriginal.trim().replace(/\s+/g, ' ');

}
async function main() {
    const rl = createInterface({ input: stdin, output: stdout });
    const textoOriginal = await rl.question("Digite uma frase ou texto: ");

    if (!textoOriginal || textoOriginal.trim() === "") {
        console.log("ERROR!! Entrada Inválida!!")
        rl.close();
        return
    }

    const retorno = normalizarTexto(textoOriginal);
    console.log(`${retorno}`)
    rl.close();
}
main();