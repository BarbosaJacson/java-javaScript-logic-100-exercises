public class Questao84Service {
    private Questao84Service(){}

    public static Boolean palindromePalavra(final String textoOriginal){

        if (textoOriginal == null || textoOriginal.isBlank()) {
            return false;
        }
        String textoNormalizado = textoOriginal.replaceAll("\\s+", "").toLowerCase();
        String textoInvertido = new StringBuilder(textoNormalizado).reverse().toString();

        return textoNormalizado.equals(textoInvertido);
    }

}
