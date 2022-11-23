import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Exercicioslaços6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Digite a palavra ");
        String palavra = scanner.nextLine();

        System.out.print(" Digite a letra ");
        char letra = scanner.next().charAt(0);

        int quantidadeDeLetras = 0;

        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == letra) {
                quantidadeDeLetras++;
            }

        }
        System.out.println(" Possui " + quantidadeDeLetras + " letras " + letra + " na palavra " + palavra);
    }
}