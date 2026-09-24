const { stdin, stdout } = require("node:process");
const { createInterface } = require("node:readline");

async function main() {
    const rl = createInterface({ input: stdin, output: stdout });
    const dados = 30;
    const elementoExtra = Math.floor(Math.random() * dados) + 1;
    const valorExtra = Math.floor(Math.random() * dados) + 1;
    const posicao = Math.floor(Math.random() * dados) + 1;
    const lista = Array.from({ length: dados }, () => Math.floor(Math.random() * dados) + 1);
    lista.sort((a, b) => a - b);
    console.log("Lista inicial (ordenada):", lista);

    lista.push(elementoExtra);
    console.log(`a. Após inserir ${elementoExtra} no final:`, lista);

    lista.splice(posicao, 0, elementoExtra);
    console.log(`b. Após inserir ${elementoExtra} na posição ${posicao}:`, lista);

    lista.splice(posicao, 1);
    console.log(`c. Após remover o elemento da posição ${posicao}:`, lista);

    let lista2 = lista.filter(n => n != valorExtra);
    console.log(`d. Após remover todos os elementos iguais a ${valorExtra}:`, lista);

    const listaSemDuplicatas = [...new Set(lista)].sort((a, b) => a - b);
    console.log("e. Nova lista (sem duplicidades):", listaSemDuplicatas);

    rl.close();

}
main();