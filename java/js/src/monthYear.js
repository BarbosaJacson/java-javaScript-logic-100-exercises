const { createInterface } = require("node:readline/promises");
const { stdin, stdout } = require("node:process");

async function main() {

    const rl = createInterface({ input: stdin, output: stdout });
    const mes = Number(await rl.question("Digite o número correspondente do mês: "));

    switch (mes) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            console.log("31 dias");
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            console.log("30 dias");
            break;
        case 2:
            console.log("28 dias (ou 29 em anos bissextos)");
            break;
        default:
            console.log("Mês inválido.");
            break;
    }
    rl.close();
}
main();