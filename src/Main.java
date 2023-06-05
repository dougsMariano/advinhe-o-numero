import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao jogo de advinhação!");
        Scanner leitura = new Scanner(System.in);
        Random random = new Random();
        int numeroGerado = random.nextInt(100);
        int tentativas = 0;

        System.out.println(numeroGerado);
        for (int tentativa = 0; tentativa < 5; tentativa++) {
            System.out.println("Entre com o número e veja se você acerta:");
            int palpite = leitura.nextInt();

            if (palpite == numeroGerado) {
                System.out.println("Parabéns, você acertou!");
                break;
            } else if (palpite > numeroGerado) {
                System.out.println("Número maior que o gerado!");
            } else {
                System.out.println("Número menor que o gerado!");
            }
        }
    }
}