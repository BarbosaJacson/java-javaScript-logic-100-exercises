import java.util.Scanner;

public class Questao80Service {
    public static Boolean contemTexto(final String primeiroTexto, final String segundoTexto) {
        if (primeiroTexto == null || primeiroTexto.isBlank() ||
                segundoTexto == null || segundoTexto.isBlank()) {
            return false;
        }
        String textoTratado = primeiroTexto.toLowerCase();
        String buscaTratado = segundoTexto.toLowerCase();

        return textoTratado.contains(buscaTratado);
    }

}
