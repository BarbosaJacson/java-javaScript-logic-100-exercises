const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');

async function main() {
    const rl = createInterface({ input: stdin, output: stdout });

    const vetor = new Array(30);
    let valor = 0;

    for (let i = 0; i < vetor.length; i++) {
        valor = Number(await rl.question(`Digite o índice pluviométrico (mm) do dia ${i + 1}: `));
        if (isNaN(valor) || (valor < 0)) {
            console.log("ERROR! Digite um número decimal válido!");
            rl.close();
            return;
        }
        vetor[i] = valor;
    }
    let maxchuva = Math.max(...vetor);
    let minchuva = Math.min(...vetor);

    let diaMaisChuvoso = vetor.findIndex(v => v === maxchuva) + 1;
    let diaMenosChuvoso = vetor.findIndex(v => v === minchuva) + 1;

    let primeiraQuinzena = vetor.slice(0, 15);
    let mediaPrimeiraQuinzena = primeiraQuinzena.reduce((acc, val) => acc + val, 0) / primeiraQuinzena.length;

    let segundaQuinzena = vetor.slice(15);
    let mediaSegundaQuinzena = segundaQuinzena.reduce((acc, val) => acc + val, 0) / segundaQuinzena.length;

    console.log(`\n--- RELATÓRIO PLUVIOMÉTRICO (JUNHO) ---`);
    console.log(`Dia que mais choveu: Dia ${diaMaisChuvoso} (${maxchuva} mm)`);
    console.log(`Dia que menos choveu: Dia ${diaMenosChuvoso} (${minchuva} mm)`);
    console.log(`Média 1ª Quinzena: ${mediaPrimeiraQuinzena.toFixed(2)} mm`);
    console.log(`Média 2ª Quinzena: ${mediaSegundaQuinzena.toFixed(2)} mm`);
    rl.close();
}
main();