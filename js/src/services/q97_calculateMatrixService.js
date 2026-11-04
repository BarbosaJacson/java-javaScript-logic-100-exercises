export class MatrizService {
    static criarMatriz(tamanho = 5) {
        let contador = 1;
        return Array.from({ length: tamanho }, () =>
            Array.from({ length: tamanho }, () => contador++)
        );
    }

    static clonarMatriz(matriz) {
        return matriz.map(linha => [...linha]);
    }

    static trocarLinhas(matriz, x, y) {
        const resultado = this.clonarMatriz(matriz);
        [resultado[x], resultado[y]] = [resultado[y], resultado[x]];
        return resultado;
    }

    static trocarColunas(matriz, x, y) {
        const resultado = this.clonarMatriz(matriz);
        resultado.forEach(linha => {
            [linha[x], linha[y]] = [linha[y], linha[x]];
        });
        return resultado;
    }

    static trocarDiagonais(matriz) {
        const resultado = this.clonarMatriz(matriz);
        const n = resultado.length;

        for (let i = 0; i < n; i++) {
            const jSecundario = n - 1 - i;
            [resultado[i][i], resultado[i][jSecundario]] = [resultado[i][jSecundario], resultado[i][i]];
        }

        return resultado;
    }

    static formatarMatriz(matriz) {
        return matriz
            .map(linha => linha.map(val => String(val).padStart(3, ' ')).join(' '))
            .join('\n');
    }
}