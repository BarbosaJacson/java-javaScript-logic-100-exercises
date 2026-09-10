const {createInterface} = require('node:readline/promises');
const {stdin, stdout} = require('node:process');


async function main(){

const rl = createInterface({input:stdin, output: stdout});

let amigoA = Number(await rl.question("Digite o primeiro númeto: "))

if (isNaN(amigoA) || amigoA <= 0) {
        console.log("Erro: Digite um número inteiro válido e maior que zero!");
        rl.close();
        return;
    }
let amigoB = Number(await rl.question("Digite o segundo númeto: "))

if (isNaN(amigoB) || amigoB <= 0) {
        console.log("Erro: Digite um número inteiro válido e maior que zero!");
        rl.close();
        return;
    }

let divisorA = 0;
let divisorB = 0;

        for (let i = 1; i < amigoA; i++) {
            if (amigoA % i == 0) {

                divisorA = divisorA + i;
            }
        }

        for (let j = 1; j < amigoB; j++) {
            if (amigoB % j == 0) {

                divisorB = divisorB + j;
            }
        }
        if (divisorA == amigoB && divisorB == amigoA) {

            console.log(`Os números  ${amigoA} e ${amigoB} são amigos.`);
        } else {
            console.log(`Os números  ${amigoA} e ${amigoB} não são amigos.`);
        }

        rl.close();

}
main();