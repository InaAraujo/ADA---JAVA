import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {


        Scanner scannerFileiras = new Scanner(System.in);
        System.out.println("Coloque a fileira aqui");
        int fileiras = scannerFileiras.nextInt();



        Scanner scannerCadeiras = new Scanner(System.in);
        System.out.println("Coloque a quantidade de cadeiras aqui");
        int cadeiras = scannerCadeiras.nextInt();




        System.out.println("Quantidade recebida: " + fileiras + " e " + cadeiras);

        int capacidade = fileiras * cadeiras;
        System.out.println("A capacidade da sala é: " + capacidade);

    }
}


