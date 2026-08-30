const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');


async function main() {

    const rl = createInterface({ input: stdin, output: stdout });
    const inputX = parseFloat(await rl.question('Digite a coordenada X: '));
    const inputY = parseFloat(await rl.question('Digite a coordenada Y:'));

    if (inputX == 0 && inputY == 0) {
        console.log("Origem");
    } else if (inputX == 0) {
        console.log("Eixo Y");
    } else if (inputY == 0) {
        console.log("Eixo X");
    } else if (inputX > 0 && inputY > 0) {
        console.log("Q1");
    } else if (inputX < 0 && inputY > 0) {
        console.log("Q2");
    } else if (inputX < 0 && inputY < 0) {
        console.log("Q3");
    } else if (inputX > 0 && inputY < 0) {
        console.log("Q4");
    }

    rl.close();

}