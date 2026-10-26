import java.util.Arrays;

public class Questao90Service {
    public Questao90Service() {
    }

    public static String reordenarVogaisEConsoantes(final String textoOriginal) {
        if (textoOriginal == null || textoOriginal.isBlank()) {
            return "";
        }
        StringBuilder vogais = new StringBuilder();
        StringBuilder consoantes = new StringBuilder();

        for (char c : textoOriginal.strip().toCharArray()) {
            char cMin = Character.toLowerCase(c);
            Boolean ehVogal = "aeiou".indexOf(cMin) != -1;

            if (ehVogal) {
                vogais.append(c);
            } else {
                consoantes.append(c);
            }

        }
        vogais.append(consoantes);
        return vogais.toString();
    }
}
