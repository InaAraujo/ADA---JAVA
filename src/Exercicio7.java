import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int anodeNascimento;
        int anoAtual = 2022;

        System.out.println("Coloque o seu ano de nascimento aqui");
        anodeNascimento = scanner.nextInt();

        int idade = anoAtual - anodeNascimento;

        System.out.println("Sua idade é " + idade);
    }
}
