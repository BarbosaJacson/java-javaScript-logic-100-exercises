const { stdin, stdout } = require("node:process");
const { createInterface } = require("node:readline/promises");

const reordenarString = (textoOriginal) => {
    if (!textoOriginal || typeof textoOriginal !== 'string') {
        return "";
    }
    const textoLimpo = textoOriginal.trim();
    if (textoLimpo === "") {
        return "";
    }
    let vogais = "";
    let consoantes = "";
    for (const c of textoLimpo) {
        const ehVogal = "aeiou".includes(c);
        if(ehVogal){
            vogais += c;
        } else {
            consoantes += c;
        }
    }
return vogais + consoantes;
}
async function main() {
    const rl = createInterface({ input: stdin, output: stdout });
    const textoOriginal = await rl.question("Digite uma palavra: ");
    if (!textoOriginal || textoOriginal.trim() === "") {
        console.log("ERROR!! Digite palavra válida!!");
        rl.close();
        return;
    }

    const reordenado = reordenarString(textoOriginal);
    console.log(`A palavra reordenada é ${reordenado}`);
    rl.close();
}
main();