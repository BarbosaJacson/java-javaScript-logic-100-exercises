import { MatrizService } from '../services/q97_calculateMatrixService';

function main() {
    const x = 1;
    const y = 3;

    let matriz = MatrizService.criarMatriz(5);

    console.log("=== MATRIZ ORIGINAL 5x5 ===");
    console.log(MatrizService.formatarMatriz(matriz));
    console.log("\n");

    matriz = MatrizService.trocarLinhas(matriz, x, y);
    console.log(`=== 1. TROCA DA LINHA ${x} PELA LINHA ${y} ===`);
    console.log(MatrizService.formatarMatriz(matriz));
    console.log("\n");

    matriz = MatrizService.trocarColunas(matriz, x, y);
    console.log(`=== 2. TROCA DA COLUNA ${x} PELA COLUNA ${y} ===`);
    console.log(MatrizService.formatarMatriz(matriz));
    console.log("\n");

    matriz = MatrizService.trocarDiagonais(matriz);
    console.log("=== 3. TROCA DA DIAGONAL PRINCIPAL COM A SECUNDÁRIA ===");
    console.log(MatrizService.formatarMatriz(matriz));
}

main();
