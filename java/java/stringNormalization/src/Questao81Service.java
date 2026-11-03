public class Questao81Service {
    private Questao81Service() {
    }

    public static String normalizarTexto(final String textoOriginal) {
        if (textoOriginal == null || textoOriginal.isBlank()) {
            return "";
        }

        return textoOriginal.strip().replaceAll("\\s+", " ");
    }

}
