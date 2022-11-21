import java.util.Random;
import java.util.Scanner;

public class ExerciciosCondicionais4 {

        public static void main(String[] args) {
            Scanner scannerNum = new Scanner(System.in);
            System.out.println("Aposte em um numero de 1 a 6" );
            int num = scannerNum.nextInt();

            Random sorteio = new Random();
            int numeroSorteado = sorteio.nextInt(6);

            if(num > 6 || num < 0) {
                System.out.println("Numero invalido");
            }else if (num == numeroSorteado) {
                System.out.println("Parabens o numero" + "Foi sorteado");
            }else if (num != numeroSorteado){
                System.out.println("O numero sorteado foi" + numeroSorteado + "tente mais uma vez");
            }
    }
}
