import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {


        int ano1 = 2022;
        int ano2 = 1998;
        int anodeNascimento;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Coloque o seu ano de nascimento aqui");
        anodeNascimento = scanner.nextInt();

        System.out.println("Os numeros recebidos sao: " + ano1 + " e " + ano2);

        int resultado = ano1 - ano2;
        System.out.println("A idade é: " + resultado);


    }
}


