import java.util.Locale;

public class Questao89Service {
    public Questao89Service() {
    }
    public static String convertNameToInitials(String nomeCompleto){
        if(nomeCompleto==null || nomeCompleto.isBlank()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String nomeLimpo = nomeCompleto.strip();
        String[] nomeSeparado = nomeLimpo.split("\\s+");
        if(nomeSeparado.length == 1){
            return nomeSeparado[0];
        }
        String ultimoNome = nomeSeparado[nomeSeparado.length -1];
        sb.append(ultimoNome).append(", ");
        for(int i=0;i< nomeSeparado.length-1;i++){
            char inicial = nomeSeparado[i].toUpperCase(Locale.ROOT).charAt(0);
            sb.append(inicial).append(". ");
        }

        return sb.toString().strip();
    }
}
