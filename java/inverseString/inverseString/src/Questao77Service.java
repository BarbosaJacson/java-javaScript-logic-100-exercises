public class Questao77Service {

    private Questao77Service() {
    }

    public static String inverterTexto(final String texto) {

        if (texto == null || texto.isBlank()) {

            return texto;
        }
        return new StringBuilder(texto).reverse().toString();
    }
}
