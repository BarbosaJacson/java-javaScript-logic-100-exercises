const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');
const { isAscii } = require('node:buffer');

async function main() {
    const rl = createInterface({ input: stdin, output: stdout });
    const input = await rl.question("Digite qualquer coisa: ");
    const char = input.toLowerCase();

    switch (char) {
        case '0': case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9':
            console.log(`O caracter ${char} digitado é um número.`);
            break;

        case 'a': case 'e': case 'i': case 'o': case 'u':
            console.log(`O caracter ${char} digitado é uma vogal.`);
            break;

        default:
            if (char >= 'a' && char <= 'z') {
                console.log(`O caractere ${char} é uma consoante.`);
            } else {
                console.log(`O caractere ${char} é um símbolo.`);
            }
            break;
    }
    rl.close();
}
main();