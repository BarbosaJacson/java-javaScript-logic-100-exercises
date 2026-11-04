import java.util.Arrays;
import java.util.Scanner;
import services.Q97_CalculateMatrixService;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        System.out.println("--- Preenchimento da Matriz 5x5 ---");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                while (!scanner.hasNextInt()) {
                    System.out.print("Entrada inválida. Digite um número inteiro: ");
                    scanner.next();
                }
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\n--- Matriz Original ---");
        exibirMatriz(matriz);

        int x = lerIndiceValido(scanner, "Digite o valor do índice x (0 a 4): ");
        int y = lerIndiceValido(scanner, "Digite o valor do índice y (0 a 4): ");

        int[][] matrizResultante = Q97_CalculateMatrixService.permutarMatriz(matriz, x, y);

        System.out.println("\n--- Matriz Modificada após as 3 trocas ---");
        exibirMatriz(matrizResultante);

        scanner.close();
    }

    private static int lerIndiceValido(Scanner scanner, String mensagem) {
        int valor;
        while (true) {
            System.out.print(mensagem);
            if (scanner.hasNextInt()) {
                valor = scanner.nextInt();
                if (valor >= 0 && valor < 5) {
                    return valor;
                }
            } else {
                scanner.next();
            }
            System.out.println("Índice fora do limite. Informe um inteiro entre 0 e 4.");
        }
    }

    private static void exibirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            System.out.println(Arrays.toString(linha));
        }
    }
}