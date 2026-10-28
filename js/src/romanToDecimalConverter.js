const { stdin, stdout } = require('node:process');
const { createInterface } = require('node:readline/promises');

const MAPA_ROMANO = {
    'I': 1,
    'V': 5,
    'X': 10,
    'L': 50,
    'C': 100,
    'D': 500,
    'M': 1000
};

const converterRomanoParaDecimal = (textoRomano) => {
    if (!textoRomano || typeof textoRomano !== 'string') {
        return -1;
    }
    const textoLimpo = textoRomano.trim().toUpperCase();
    if (textoLimpo === "") {
        return -1;
    }
    let total = 0;
    for (let i = 0; i < textoLimpo.length; i++) {
        const valorAtual = MAPA_ROMANO[textoLimpo[i]];
        if (!valorAtual) {
            return -1;
        }
        if (i + 1 < textoLimpo.length) {
            const valorProximo = MAPA_ROMANO[textoLimpo[i + 1]];

            if (valorAtual < valorProximo) {
                total -= valorAtual;
            } else {
                total += valorAtual;
            }
        }
    }
    return total;
}
async function main() {
    const rl = createInterface({ input: stdin, output: stdout });
    const textoRomano = await rl.question("Digite um número em Romano:");
    if (!textoRomano || textoRomano.trim() === "") {
        console.log("ERROR! Digite um número Romano válido!!");
        rl.close();
        return;
    }

    const retorno = converterRomanoParaDecimal(textoRomano);
    console.log(`O número romano convertido para decimal de base 10 é: ${retorno} `);
    rl.close();
}

main();