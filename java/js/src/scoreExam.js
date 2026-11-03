'use strict'

const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});


rl.question("Digite a primeira nota do 1º bimestre: ", (primeiraNota) => {
    rl.question("Digite a segunda nota do 1ºbimestre: ", (segundaNota) => {
        rl.question("Digita a primeira nota do 2º bimestre: ", (terceiraNota) => {
            rl.question("Digite a segunda nota do 2º bimestre: ", (quartaNota) => {
                const notaUm = parseFloat(primeiraNota);
                const notaDois = parseFloat(segundaNota);
                const notaTres = parseFloat(terceiraNota);
                const notaQuatro = parseFloat(quartaNota);

                const primeiroBimestre = (notaUm + notaDois) / 2
                const segundoBimestre = (notaTres + notaQuatro) / 2

                const semestre = (primeiroBimestre + segundoBimestre) / 2

                console.log(`A nota do semestre é: , ${semestre}`)
                rl.close();

            });
        });

    });
});
