const { stdin, stdout } = require("node:process");
const { createInterface } = require('node:readline/promises');

const convertToUpperCase = (textoOriginal) => {
    if (!textoOriginal || typeof textoOriginal !== 'string') {
        console.log("ERROR!! Digite uma palavra ou texto válidos!!");
        return "";
    }
    const textoLimpo = textoOriginal.trim();
    if (textoLimpo === "") {
        return "";
    }
    return textoLimpo.toUpperCase();

}
async function main() {
    const rl = createInterface({ input: stdin, output: stdout });
    const textoOriginal = await rl.question("Digite um palavra ou texto: ");
    if (!textoOriginal || textoOriginal.trim() === "") {
        console.log("ERROR!! Digite uma palavra ou texto válidos!!");
        rl.close();
        return;
    }
    const retorno = convertToUpperCase(textoOriginal);
    console.log(`O texto em caixa alta é: ${retorno}`);
    rl.close()
}
main();