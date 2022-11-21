import java.util.Scanner;
public class ExerciciosCondicionais3 {
    public static void main(String[] args) {

        Scanner scannerNum = new Scanner(System.in);
        System.out.println("Digite os Graus que deseja converte");
        double num = scannerNum.nextInt();

        Scanner ScannerLetra = new Scanner(System.in);
        System.out.println("Digite C para converter para Celsius ou F para farenheit");
        String letra = ScannerLetra.nextLine();

        if (letra.equals ("C"))
        {double celsius = num - 32 / 1.8;
            System.out.println("O valor convertido é" + celsius);
        } else if (letra.equals("F")) {
            double farenheit = num * 1.8 + 32;
            System.out.println("O valor convertido é " + farenheit);
        }else {
            System.out.println("Valor invalido");

        }
    }
}
}
