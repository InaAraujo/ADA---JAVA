import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner scannerReal = new Scanner(System.in);
        System.out.println("O valor em Real é");
        int real = scannerReal.nextInt();


        double euro,dolar,libras,pesos;


        euro = real / 5.17;
        dolar = real / 5.17;
        libras = real / 5.86;
        pesos = real / 0.32;

        System.out.println("Valor convertido: " + euro);
        System.out.println("Valor convertido: " + dolar);
        System.out.println("Valor convertido: " + libras);
        System.out.println("Valor convertido: " + pesos);




    }
}

