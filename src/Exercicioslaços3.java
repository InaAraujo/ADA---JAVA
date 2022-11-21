import java.util.Random;

public class Exercicioslaços3 {
    public static void main(String[] args) {

        int num = 3;
        int soma = 0;

        for (int sorteio = 0; sorteio < num; sorteio++){
            Random numSorteio = new Random();
            int numeroSorteado = numSorteio.nextInt(6);
            System.out.println("O numero" + numeroSorteado + " foi sorteado");

            soma += numeroSorteado;

        }
            System.out.println("A soma dos numeros sorteados é: " + soma);
    }
}


