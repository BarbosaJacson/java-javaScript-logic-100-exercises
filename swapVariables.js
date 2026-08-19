'use strict'

const { stdin, stdout } = require("process")
const readline = require("readline")
const rl = readline.createInterface({
    input: stdin,
    output: stdout

});


rl.question("Digite o valor da primeira variavel: ", (primeiraInput) => {
    rl.question("Digite o valor da segunda variavel: ", (segundaInput) => {
        let primeira = parseInt(primeiraInput);
        let segunda = parseInt(segundaInput);

        primeira = primeira + segunda;
        segunda = primeira - segunda;
        primeira = primeira - segunda;

        console.log(`A primeira variavel é: ${primeira}`);
        console.log(`A segunda variavel é: ${segunda}`);
        rl.close();

    })
})