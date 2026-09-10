async function main() {
    let populacaoA = 5000000;
    let populacaoB = 7000000;
    let contador = 0;

    while (populacaoA <= populacaoB) {

        populacaoA = populacaoA + (populacaoA * 0.03);
        populacaoB = populacaoB + (populacaoB * 0.02);
        contador++;
    }

    console.log(`A população A irá superar a populaçao B em aproximadamente ${contador}   anos.`);
    rl.close();

}
main();