public class Questao86Service {
    public Questao86Service() {
    }

    private static int obterValorRomano(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public static int converterRomanoParaDecimal(final String textoRomano) {
        if (textoRomano == null || textoRomano.isBlank()) {
            return -1;
        }
        int valorTotal = 0;
        String textoLimpo = textoRomano.strip().toUpperCase();
        for (int i = 0; i < textoLimpo.length(); i++) {
            int valorAtual = obterValorRomano(textoLimpo.charAt(i));

            if (valorAtual == 0) {
                return -1;
            }
            if (i + 1 < textoLimpo.length()) {
                int valorProximo = obterValorRomano(textoLimpo.charAt(i + 1));

                if (valorAtual < valorProximo) {
                    valorTotal -= valorAtual;
                } else {
                    valorTotal += valorAtual;
                }
            } else {
                valorTotal += valorAtual;
            }
        }
        return valorTotal;
    }
}
