import java.util.Random;

public class Exercicioslaços5 {
    public static void main(String[] args) {
        int num =Integer.parseInt(args[0]);
        int numeroSorteado = 0;
        int quantidadeDeNumeros = 0;



        while (numeroSorteado != num){
            Random numSorteio = new Random();
            numeroSorteado = numSorteio.nextInt(1,6);
            System.out.println("O numero" + numeroSorteado + " foi sorteado");
            quantidadeDeNumeros++;

        }

        System.out.println(" Foram necessários " + quantidadeDeNumeros + " sorteios, para que o numero "
                + numeroSorteado + " fosse sorteado.");





    }

}