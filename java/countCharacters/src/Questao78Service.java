

public class Questao78Service {
    public Questao78Service() {
    }

    public static long contarOcorrencias(final String textoOriginal, final String entradaAlvo) {

        if (textoOriginal.isBlank() || entradaAlvo.isBlank()) {

            return 0L;
        }
        String texto = textoOriginal.toLowerCase();
        char alvo = Character.toLowerCase(entradaAlvo.charAt(0));

        return texto.chars().filter(c -> c == alvo).count();
    }

}
