const { stdin, stdout } = require("node:process");
const { createInterface } = require("node:readline/promises");


const contemTexto = (textoPrincipal, buscaTexto) => {

    if (!textoPrincipal || typeof textoPrincipal !== 'string' || !buscaTexto || typeof buscaTexto !== 'string') {
        return false;
    }

    const textoTratado = textoPrincipal.toLowerCase();
    const buscaTratada = buscaTexto.toLowerCase();

    return textoTratado.includes(buscaTratada);

}

async function main() {
    const rl = createInterface({ input: stdin, output: stdout });
    const textoPrincipal = await rl.question(`Digite a primeira palavra!!`);
    if (!textoPrincipal || textoPrincipal.trim() === "") {
        console.log("ERROR!! Entrada Inválida!!")
        rl.close();
        return
    }

    const buscaTexto = await rl.question(`Digite a segunda palavra!!`);

    if (!buscaTexto || buscaTexto.trim() === "") {
        console.log("ERROR!! Entrada Inválida!!")
        rl.close();
        return
    }

    const contem = contemTexto(textoPrincipal, buscaTexto);
    console.log(`O texto "${textoPrincipal}" contém "${buscaTexto}"? ${contem}`);
    rl.close()

}
main();