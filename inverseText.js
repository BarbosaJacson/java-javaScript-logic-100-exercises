const { stdin, stdout } = require("node:process");
const { createInterface } = require("node:readline/promises");

const inverterTexto = (texto) => {
    if (!texto || typeof texto !== "string") {
        return "";
    }
    return [...texto].reverse().join('');
};

async function main() {
    const rl = createInterface({ input: stdin, output: stdout });
    const texto = await rl.question("Digite uma palavra ou frase: ");
    if (!texto || texto.trim() === "") {
        console.log("Erro: Entrada inválida!");
        rl.close();
        return;
    }
    const resultadoInvertido = inverterTexto(texto);
    console.log(`Texto invertido: ${resultadoInvertido}`);
    rl.close();
};
main();

