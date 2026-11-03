const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');

async function main() {

    const rl = createInterface({ input: stdin, output: stdout });
    const ATT = Number(await rl.question("Digite a quantidade de passes tentados: "));

    if (ATT <= 0) {
        console.log("Digite um valor maior que zero!");
        rl.close();
        return;
    }
    let min = 0;
    let max = 2.375;

    const COMP = Number(await rl.question("Digite a quantidade de passes completados: "));
    const YDS = Number(await rl.question("Digite a quantidade de jardas passadas tentadas: "));
    const TD = Number(await rl.question("Digite a quantidade de passes para touchdown: "));
    const INT = Number(await rl.question("Digite a quantidade de passes interceptados: "));

    let A = ((COMP / ATT) - 0.3) / 0.2;
    let percPassesComp = Math.max(min, Math.min(A, max));

    let B = ((YDS / ATT) - 3) / 4;
    let mediaJardasTentativas = Math.max(min, Math.min(B, max));

    let C = (TD / ATT) / 0.05;
    let mediaTochTentativas = Math.max(min, Math.min(C, max));

    let D = (0.095 - (INT / ATT)) / 0.04;
    let mediaIntercepTentativas = Math.max(min, Math.min(D, max));

    let QB = ((percPassesComp + mediaJardasTentativas + mediaTochTentativas + mediaIntercepTentativas) * 100) / 6;

    console.log(`A avaliação do QuarterBack foi de ${QB.toFixed(2)}`);
    rl.close();

}
main();