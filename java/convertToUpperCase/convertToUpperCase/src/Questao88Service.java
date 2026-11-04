import java.util.Locale;

public class Questao88Service {
    public Questao88Service() {
    }

    public static String convertToUpperCase(String textoOriginal) {
        if (textoOriginal == null || textoOriginal.isBlank()) {
            return "";
        }

        return textoOriginal.toUpperCase(Locale.ROOT);
    }
}
