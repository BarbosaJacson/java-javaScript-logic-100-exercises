const {createInterface} = require('node:readline/promises');
const {stdin, stdout} = require('node:process');


async function main(){
const rl = createInterface({input:stdin, output:stdout});
const numero = Number(await rl.question("Digite um númento inteiro: "));

if(isNaN(numero) || numero <= 0){
    console.log("ERROR!! Digite um número válido!!");
    rl.close();
    return;
}

let denominador = 1.0;
let euller = 1.0;

for(let i = 1;i <= numero;i++){
    denominador *= i;
    euller += 1 / denominador; 
}
console.log(`O número de Euller para o termo ${numero}, é ${euller.toFixed(2)}.`);
rl.close();
}
main();