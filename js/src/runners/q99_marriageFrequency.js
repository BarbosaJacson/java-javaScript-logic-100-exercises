import readline from 'node:readline/promises';
import { stdin as input, stdout as output } from 'node:process';
import { MarriageFrequencyService } from '../services/q99_marriageFrequencyService.js';

async function main() {
    const rl = readline.createInterface({ input, output });
    const matrix = MarriageFrequencyService.createFrequencyMatrix();

    while (true) {
        const manInput = await rl.question("Digite a idade do homem (18 a 30): ");
        const manAge = Number(manInput);

        if (!MarriageFrequencyService.isValidAge(manAge)) {
            console.log("Entrada inválida ou fora do intervalo (18-30). Encerramento Fail-Fast.");
            break;
        }

        const womanInput = await rl.question("Digite a idade da mulher (18 a 30): ");
        const womanAge = Number(womanInput);

        if (!MarriageFrequencyService.isValidAge(womanAge)) {
            console.log("Entrada inválida ou fora do intervalo (18-30). Encerramento Fail-Fast.");
            break;
        }

        MarriageFrequencyService.registerMarriage(matrix, manAge, womanAge);
    }

    rl.close();

    console.log("\n=== RELATÓRIO ESTATÍSTICO DE CASAMENTOS ===");

    const mostFrequentManAge = MarriageFrequencyService.getMostFrequentManAge(matrix);
    console.log(`(1) Idade mais frequente de casamento dos homens: ${mostFrequentManAge > 0 ? `${mostFrequentManAge} anos` : 'Nenhum registro'}`);

    const mostFrequentWomanAge = MarriageFrequencyService.getMostFrequentWomanAge(matrix);
    console.log(`(2) Idade mais frequente de casamento das mulheres: ${mostFrequentWomanAge > 0 ? `${mostFrequentWomanAge} anos` : 'Nenhum registro'}`);

    const [manAge, womanAge] = MarriageFrequencyService.getMostFrequentCombination(matrix);
    if (manAge > 0 && womanAge > 0) {
        console.log(`(3) Combinação mais frequente: Homem com ${manAge} anos e Mulher com ${womanAge} anos.`);
    } else {
        console.log("(3) Combinação mais frequente: Nenhum registro válido.");
    }
}

main();