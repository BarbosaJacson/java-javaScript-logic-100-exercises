import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        ArrayList<Integer> list = new ArrayList<>();
        int dv = 0;
        int digito;
        int conta = 0;
        int soma = 0;
        int resto = 0;

        for (int i = 4; i >= 1; i--) {
            System.out.print("Digite o " + (5 - i) + "º dígito da agência: ");
            conta = scanner.nextInt();
            digito = conta * (i + 1);
            soma += digito;
            list.add(conta);

        }
        resto = soma % 11;
        dv = 11 - resto;
        String dvResultado;

        if (dv == 10) {
            dvResultado = "X";
        } else if (dv == 11) {
            dvResultado = "0";
        } else {
            dvResultado = String.valueOf(dv);
        }

        System.out.println("Agência: " + list.get(0) + list.get(1) + list.get(2) + list.get(3) + "-" + dvResultado);

        scanner.close();
    }
}