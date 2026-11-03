'use strict'

const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Digite sua idade em dias: ", (ano) => {
    const dias = parseInt(ano);

    
    const anos = Math.floor(dias / 365);
    const restoAnos = dias % 365;
    const mes = Math.floor(restoAnos / 30);
    const diasRestantes = restoAnos % 30;
    

    console.log(`A idade é : ${anos} anos, ${mes} mes(es), e ${diasRestantes} dia(s)`);
       
    rl.close();
});