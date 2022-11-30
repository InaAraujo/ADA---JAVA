import java.util.Scanner;
public class ExerciciosCondicionais3 {
    public static void main(String[] args) {

        double num = digitarGraus();
        String letra = digitarLetra();


        if (letra.equals ("C")){
           double celsius = calcularCelsius(num);
            System.out.println("O valor convertido é" + celsius);

        } else if (letra.equals("F")) {
            double farenheit = calcularFarenheit(num);
            System.out.println("O valor convertido é " + farenheit);

        }else {
            System.out.println("Valor invalido");

        }
    }

    static double digitarGraus(){
        Scanner scannerNum = new Scanner(System.in);
        System.out.println("Digite os Graus que deseja converte");
        double num = scannerNum.nextInt();
        return num;
    }

    static String digitarLetra(){
        Scanner ScannerLetra = new Scanner(System.in);
        System.out.println("Digite C para converter para Celsius ou F para farenheit");
        String letra = ScannerLetra.nextLine();
        return letra;
    }

    static double calcularCelsius(double num){
       return num - 32 / 1.8;
    }

    static double calcularFarenheit(double num){
        return num * 1.8 + 32;
    }


}

