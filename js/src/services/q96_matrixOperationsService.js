const calcularSomaEDiferenca = (matrizA, matrizB) => {

    for (let i = 0; i < matrizA.length; i++) {
        if (!matrizA || !Array.isArray(matrizA) || matrizA.length === 0) {
            throw new Error("ERROR!! Matriz inválida para linearização.");
        }
        if (!matrizB || !Array.isArray(matrizB) || matrizB.length === 0) {
            throw new Error("ERROR!! Matriz inválida para linearização.");
        }
        const matrizSoma = Array.from({ length: 3 }, () => Array(4).fill(0));
        const matrizDiferenca = Array.from({ length: 3 }, () => Array(4).fill(0));

        for (let i = 0; i < matrizA.length; i++) {
            for (let j = 0; j < matrizA[i].length; j++) {
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
                matrizDiferenca[i][j] = matrizB[i][j] - matrizB[i][j];
            }
        }
        return {
            soma: matrizSoma,
            diferenca: matrizDiferenca
        };

    }
}

module.exports = { calcularSomaEDiferenca };