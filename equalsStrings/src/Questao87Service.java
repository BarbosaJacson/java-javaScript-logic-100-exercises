import java.util.Locale;

public class Questao87Service {
    public Questao87Service() {
    }

    public static Boolean compareStrings(String primeira, String segunda) {
        if ((primeira == null || primeira.isBlank()) || (segunda == null || segunda.isBlank())) {
            return false;
        }
    return primeira.equalsIgnoreCase(segunda);
    }
}
