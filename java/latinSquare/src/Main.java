import services.LatinSquareService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a ordem N da matriz: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Encerramento Fail-Fast.");
            scanner.close();
            return;
        }

        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Ordem N deve ser maior que zero. Encerramento Fail-Fast.");
            scanner.close();
            return;
        }

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Entrada inválida. Encerramento Fail-Fast.");
                    scanner.close();
                    return;
                }
                matrix[i][j] = scanner.nextInt();
            }
        }

        boolean result = LatinSquareService.isLatinSquare(matrix);

        if (result) {
            System.out.println("A matriz fornecida É um Quadrado Latino de Ordem " + n + ".");
        } else {
            System.out.println("A matriz fornecida NÃO É um Quadrado Latino de Ordem " + n + ".");
        }

        scanner.close();
    }
}