const {createInterface} = require("node:readline/promises");
const {stdin, stdout} = require("node:process");

async function main(){
const rl = createInterface({input:stdin, output:stdout});
const entrada = await rl.question("Digite uma letra do alfabeto: ");
const letra = entrada.trim().toLowerCase();

if (!/^[a-z]$/i.test(letra)) {
        console.log("Erro: Por favor, digite apenas uma única letra válida!");
        rl.close();
        return;
    }

switch (letra) {

    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
        console.log(`A letra ${letra} é uma vogal`)            ;
        break;

    default:
            console.log(`A letra ${letra} é uma consoante`);
            break;

}
rl.close();
}
main();