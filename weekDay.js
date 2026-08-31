const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');


async function main() {
    const rl = createInterface({ input: stdin, output: stdout });
    let numero = Number(await rl.question('Digite um número de 1 a 7:  '));
    
    switch (numero) {

        case 1:
            console.log('Domingo');
            break;
        case 2:
            console.log('Segunda-Feira');
            break;
        case 3:
            console.log('Terça-Feira');
            break;
        case 4:
            console.log('Quarta-Feira');
            break;
        case 5:
            console.log('Quinta-Feira');
            break;
        case 6:
            console.log('Sexta-Feira');
            break;
        case 7:
            console.log('Sábado');
            break;
        default:
            console.log('Erro: Digite um número válido entre 1 e 7.');
    }
    rl.close();
}
main();