const {createInterface} = require('node:readline/promises');
const {stdin, stdout} = require('node:process');
const { randomInt } = require('node:crypto');

async function main(){
    const rl = createInterface({input: stdin, output:stdout});

    const vetor = new Array(100);
    for(let i =0; i< vetor.length;i++){
        vetor[i] = Math.floor(Math.random() * 100) + 1;
    }
    console.log(`${vetor}`)

    const numero = Number(await rl.question("Digite um númento inteiro: "));
    if(isNaN(numero)){
        console.log("ERROR!! Digite um número inteiro!!")
        rl.close();
        return;
    }
    let ocorrencias = vetor.filter(n => n === numero).length;
    console.log(`O número ${numero} aparece ${ocorrencias} vez(es) no vetor.`);

rl.close();
}
main();