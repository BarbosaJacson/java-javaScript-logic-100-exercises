const { stdin, stdout } = require("node:process");
const { createInterface } = require("node:readline");

async function main() {
    const rl = createInterface({ input: stdin, output: stdout });

    const vetor = Array.from({ length: 20 }, () => Math.floor(Math.random() * 20) + 1);
    vetor.sort((a, b) => a - b);
    console.log(`${vetor}`);
    let mediana = (vetor[9] + vetor[10]) / 2.0;
    let media = vetor.reduce((acc, val) => acc + val, 0) / vetor.length;
    const frequencia = vetor.reduce((acc, num) => {
        acc[num] = (acc[num] || 0) + 1;
        return acc;
    }, {});

    const moda = Object.entries(frequencia).reduce((max, curr) =>
        curr[1] > max[1] ? curr : max
    )[0];

    console.log(`Media: ${media.toFixed(2)}| Mediana: ${mediana.toFixed(2)}| Moda: ${moda}`)

    rl.close();

}
main();