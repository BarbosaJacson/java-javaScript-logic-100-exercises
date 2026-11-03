const { stdin, stdout } = require('node:process');
const { createInterface } = require('node:readline/promises');

const convertNameToInitials = (nomeCompleto) => {
    if (!nomeCompleto || typeof nomeCompleto !== 'string') {
        return "";
    }
    const nomeLimpo = nomeCompleto.trim().split(/\s+/);
    if (nomeLimpo.length === 0 || nomeLimpo[0] === "") {
        return "";
    }
    if (nomeLimpo.length === 1) {
        return nomeLimpo[0];
    }
    const ultimoNome = nomeLimpo.pop();
    const iniciais = nomeLimpo
        .map(prenome => `${prenome[0].toUpperCase()}.`)
        .join(' ');

    return `${ultimoNome}, ${iniciais}`;
};
async function main() {
    const rl = createInterface({ input: stdin, output: stdout });
    const nomeCompleto = await rl.question("Digite o nome completo: ");
    if (!nomeCompleto || nomeCompleto.trim() === "") {
        console.log("ERROR!! Digite um nome completo válido!!");
        rl.close();
        return;
    }
    const retorno = convertNameToInitials(nomeCompleto);
    console.log(`A conversão do nome completo para initialis é: ${retorno}`);
    rl.close()
}
main();