import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {


        Scanner scannerTemperatura = new Scanner(System.in);
        System.out.println(" Graus celsius");
        int temperatura = scannerTemperatura.nextInt();


        double valor;

        valor = temperatura * 1.8 + 32;

        System.out.println("conversão para farenheit: " + valor);


    }
}