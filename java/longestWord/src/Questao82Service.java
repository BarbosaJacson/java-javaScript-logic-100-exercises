import java.util.Arrays;
import java.util.Comparator;

public class Questao82Service {
    private Questao82Service() {
    }

    public static String encontrarMaiorPalavra(final String textoOriginal) {

        if (textoOriginal == null || textoOriginal.isBlank()) {
            return "";
        }
        String textoNormalizado = textoOriginal.strip().replaceAll("\\s+", " ");
        String[] palavras = textoNormalizado.split(" ");
        String maior = Arrays.stream(palavras).max(Comparator.comparingInt(String::length)).orElse("");

        return maior;
    }
}
