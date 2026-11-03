import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.printf("Digite a distância do semaforo em metros: ");
        int distancia = scanner.nextInt();

        System.out.printf("Digite a velocidade da via em km/h: ");
        double velocidade = scanner.nextDouble();

        System.out.printf("Digite a aceleração típica dos carros: ");
        double aceleracao = scanner.nextDouble();
        double velocidadeMs = velocidade / 3.6;
        double t1 = velocidadeMs / aceleracao;
        double d1 = aceleracao * (Math.pow(t1, 2)) / 2;
        double d2 = distancia - d1;
        double t2 = d2 / velocidadeMs;
        double tempoAbertura = (t1 + t2) - 3;

        System.out.printf("O tempo de abertura do semaforo seguinte será de: %.2f segundos", tempoAbertura);

        scanner.close();


    }
}