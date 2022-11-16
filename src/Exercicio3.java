import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scannerKilometros = new Scanner(System.in);
        System.out.println("O valor em kilometros é");
        int kilometros = scannerKilometros.nextInt();


        double milhas;

       milhas = kilometros / 1.609;

        System.out.println("O valor em milhas é: " + milhas);


    }
}

