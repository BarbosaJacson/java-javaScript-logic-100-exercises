const { stdin, stdout } = require("node:process");
const { createInterface } = require("node:readline/promises");

const contarVogais = (palavra) => {

    const resultado = [...palavra.toLowerCase()].filter(char => "aeiou".includes(char)).length;
    return resultado;

}
async function main() {
    const rl = createInterface({ input: stdin, output: stdout });
    const palavra = await rl.question("Digite uma palavra: ");

    if (!palavra || typeof palavra !== 'string') {
        console.log("ERROR!! Digite apenas palavras!!")
        return 0;
    }

    const totalVogais = contarVogais(palavra);
    console.log(`A palavra "${palavra}" tem ${totalVogais} vogais.`);
    rl.close();
}
main();