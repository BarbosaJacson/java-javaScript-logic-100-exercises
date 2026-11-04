const calcularValorMatriz = (valorEscalar, matriz) => {
    if (!matriz || !Array.isArray(matriz) || matriz.length === 0) {
        return false;
    }
    if (matriz.length !== matriz[0].length) {
        return false;
    }
    for (let i = 0; i < matriz.length; i++) {
        for (let j = 0; j < matriz[i].length; j++) {
            matriz[i][j] = matriz[i][j] * valorEscalar;
        }
    }
    return matriz;
}
module.exports = { calcularValorMatriz };