const linearizarMatriz = (matriz) => {
   
    if (!matriz || !Array.isArray(matriz) || matriz.length === 0) {
        throw new Error("ERROR!! Matriz inválida para linearização.");
    }

    const vetorResultante = [];
    let k =0;
    
    for (let i = 0; i < matriz.length; i++) {
        for (let j = 0; j < matriz[i].length; j++) {
            vetorResultante[k++] = matriz[i][j];
        }
    }

    return vetorResultante;
}
module.exports = { linearizarMatriz };