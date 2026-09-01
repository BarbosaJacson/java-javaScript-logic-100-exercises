const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');

async function main (){
const rl = createInterface({input: stdin, output: stdout});
const praga = parseInt(await rl.question('Digite um número de 1 a 4: '));
const acres = parseFloat(await rl.question('Digite a quantidade de acres: '));

let precoPorAcre = 0;
switch(praga){
            case 1: precoPorAcre = 50.0;
            break;
            case 2: precoPorAcre = 100.0;
            break;
            case 3: precoPorAcre = 150.0;
            break;
            case 4: precoPorAcre = 250.0;
            break;
            default:
        console.log("Tipo de praga inválido");
}

let custoBruto = acres * precoPorAcre;

if (acres > 1000) {
    custoBruto *= 0.95;
}

if (custoBruto > 750.00) {
    const excedente = custoBruto - 750.00;
    custoBruto = 750.00 + (excedente * 0.90);
}

console.log(`O custo total é de R$ ${custoBruto.toFixed(2)}`);
rl.close();
}
main();
