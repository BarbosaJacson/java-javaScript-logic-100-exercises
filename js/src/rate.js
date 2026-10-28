const { createinterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');

async function main() {
    const rl = createinterface({ input: stdin, output: stdout });
    const e1 = Number(await rl.question("Digite o valor da primeira nota: "));
    const e2 = Number(await rl.question("Digite o valor da segunda nota: "));
    const e3 = Number(await rl.question("Digite o valor da terceira nota: "));
    const e4 = Number(await rl.question("Digite o valor da quarta nota: "));
    const e5 = Number(await rl.question("Digite o valor da quinta nota: "));

    const p1 = e1 >= 70;
    const p2 = e2 >= 70;
    const p3 = e3 >= 70;
    const p4 = e4 >= 70;
    const p5 = e5 >= 70;

   if (pI && pII && pIII && pIV && pV) {
    System.out.println("Classificação A.");
} else if (pI && pII && pIV && !pIII && !pV) {
    System.out.println("Classificação B.");
} else if (pI && pII && (pIII || pIV) && !pV) {
    System.out.println("Classificação C.");
} else {
    System.out.println("Reprovado.");
}
    rl.close();
}

main();
