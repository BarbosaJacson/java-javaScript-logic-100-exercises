/*
 * EXERCÍCIO 39 - CÁLCULO DE DÍGITO VERIFICADOR (MÓDULO 11) - BANCO DO BRASIL
 * -------------------------------------------------------------------------
 * ABORDAGEM 1 (INIBIDA): LEITURA DÍGITO A DÍGITO COM ARRAYLIST
 * - Lê cada um dos 4 dígitos individualmente em um laço 'for' (de 4 a 1).
 * - Armazena os valores em uma coleção (ArrayList<Integer>).
 * - Ótimo para praticar laços de repetição, coleções e manipulação de índices.
 * - Desvantagem: O usuário precisa pressionar 'Enter' 4 vezes.
 *
 * Code:
 * /*
 * ArrayList<Integer> list = new ArrayList<>();
 * int dv = 0, digito = 0, conta = 0, soma = 0, resto = 0;
 * for (int i = 4; i >= 1; i--) {
 *     System.out.print("Digite o digito da conta:");
 *     conta = scanner.nextInt();
 *     digito = conta * (i + 1);
 *     soma += digito;
 *     list.add(conta);
 * }
 * resto = soma % 11;
 * dv = 11 - resto;
 * String dvResultado = (dv == 10) ? "X" : (dv == 11 ? "0" : String.valueOf(dv));
 * System.out.println("Agência: " + list.get(0) + list.get(1) + list.get(2) + list.get(3) + "-" + dvResultado);
 * * /
 *
 * -------------------------------------------------------------------------
 * ABORDAGEM 2 (EM EXECUÇÃO): LEITURA DE STRING ÚNICA (UX OTIMIZADA)
 * - Lê o número inteiro da agência de uma só vez (ex: "4870").
 * - Extrai e converte cada caractere diretamente pelos seus índices.
 * - Multiplica pelos pesos decrescentes (5, 4, 3, 2).
 * - Vantagem: Experiência do usuário (UX) mais fluida e código enxuto.
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Digite os 4 dígitos da agência (ex: 4870): ");
        String agencia = scanner.next();

        if (agencia.length() != 4) {
            System.out.println("Erro: A agência deve conter exatamente 4 dígitos.");
            scanner.close();
            return;
        }

        // Extração dos dígitos e cálculo dos produtos com pesos (5, 4, 3, 2)
        int d1 = Character.getNumericValue(agencia.charAt(0)) * 5;
        int d2 = Character.getNumericValue(agencia.charAt(1)) * 4;
        int d3 = Character.getNumericValue(agencia.charAt(2)) * 3;
        int d4 = Character.getNumericValue(agencia.charAt(3)) * 2;

        int soma = d1 + d2 + d3 + d4;
        int resto = soma % 11;
        int dv = 11 - resto;

        String dvResultado;
        if (dv == 10) {
            dvResultado = "X";
        } else if (dv == 11) {
            dvResultado = "0";
        } else {
            dvResultado = String.valueOf(dv);
        }

        System.out.println("Agência completa: " + agencia + "-" + dvResultado);

        scanner.close();
    }
}