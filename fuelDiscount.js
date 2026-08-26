const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');


async function main() {

    const rl = createInterface({ input: stdin, output: stdout });
    let combInput = (await rl.question("Digite o tipo do combustível: "));
    let litros = Number(await rl.question("Digite a quantidade de litros: "));

    let combustivel = combInput.trim().toUpperCase().toLowerCase();

    const alcool = 1.90;
    const gasolina = 2.70;
    const taxaA1 = 0.98;
    const taxaA2 = 0.96;
    const taxaG1 = 0.97;
    const taxaG2 = 0.95;
    let preco = 0.0;

    if ((combustivel == "a") && (litros <= 25)) {

        preco = (alcool * taxaA1) * litros;
    } else if ((combustivel == "a") && (litros > 25)) {
        preco = (alcool * taxaA2) * litros;

    } else if ((combustivel == "g") && (litros <= 25)) {
        preco = (gasolina * taxaG1) * litros;
    } else if ((combustivel == "g") && (litros > 25)) {
        preco = (gasolina * taxaG2) * litros;
    }

    console.log(`O preço do combustível ${combustivel} com desconto foi de ${preco.toFixed(2)}`)

    rl.close();

}
main();
