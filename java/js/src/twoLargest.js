const {createInterface} = require('node:readline/promises');
const {stdin, stdout} = require('node:process');

async function main(){

const rl = createInterface({input: stdin, output: stdout})
const qtde = Number(await rl.question("Digite a quantidade de números: "));
let numero = 0;
let maior=-Infinity;
let segundoMaior=-Infinity;

for(let i=1; i <= qtde; i++ ) {

    numero = Number(await rl.question(`Digite o ${i}º número: `));

    if(numero > maior) {

        segundoMaior=maior;
        maior = numero;
    } else if (numero > segundoMaior){
        segundoMaior = numero;
        
    }

}
let soma = maior + segundoMaior;
console.log(`O número maior é ${maior}`);
console.log(`O segundo maior é ${segundoMaior}`);
console.log(`A soma dos dois é ${soma}`);
rl.close();

}
main();

