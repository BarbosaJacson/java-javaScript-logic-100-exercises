public class Questao79Service{
    public Questao79Service(){
    }
    public static String extrairSubstring(String textoOriginal, int inicio, int fim) {
        if (inicio < 0 || fim > textoOriginal.length() || inicio > fim) {
            return "";
        }

        return textoOriginal.substring(inicio, fim);
    }
}
