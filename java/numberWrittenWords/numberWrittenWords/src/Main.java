import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        String numeroExtenso = "";
        int resto = 0;
        int dezena = 0;
        String[] unidades = {"", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
        String[] dezenas = {"", "dez", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
        String[] especiais = {"", "onze", "doze", "treze", "catorze", "quinze"};
        String[] dez = {"", "deze"};

        System.out.print("Digite um número que esteja entre 1 e 100: ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 9) {
            numeroExtenso = unidades[numero];

        }  else if (numero % 10 == 0) {
            dezena = numero / 10;
            numeroExtenso = dezenas[dezena];
        } else if (numero >= 11 && numero <= 15) {
            resto = numero % 10;
            numeroExtenso = especiais[resto];

        } else if (numero >= 16 && numero <= 19) {
            resto = numero % 10;
            numeroExtenso = dez[1] + unidades[resto];

        } else if (numero >= 21 && numero <= 99) {
            dezena = numero / 10;
            resto = numero % 10;
            numeroExtenso = dezenas[dezena] + " e " + unidades[resto];

        } else if (numero == 100) {
            numeroExtenso = "cem";
        }
        System.out.print(numeroExtenso);
    }

}
