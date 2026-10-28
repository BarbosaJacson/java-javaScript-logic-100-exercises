public class Questao85Service {

    public Questao85Service() {
    }

    public static int converterHexParaDecimal(final String hexTexto) {
        if (hexTexto == null || hexTexto.isBlank()) {
            return -1;
        }
        String textoLimpo = hexTexto.strip().replace("0x", "").replace("0X", "");

        try {
            return Integer.parseInt(textoLimpo, 16);
        } catch (NumberFormatException e) {
            return -1;

        }
    }
}
