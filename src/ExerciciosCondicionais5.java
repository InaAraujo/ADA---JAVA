import java.util.Scanner;

public class ExerciciosCondicionais5 {

    public static void main(String[] args){
        Scanner scannerSalario = new Scanner(System.in);
        System.out.println("Digite seu salarioi: ");
        double salario = scannerSalario.nextDouble();

        if(salario <= 1212.00) {
            double aliquota = salario * 0.075;
            System.out.println("O valor de contribuição ao INSS é " + aliquota + " reais.");
        }else if (salario <= 2427.35) {
            double primeiraFaixa = 1212.00 * 0.075;
            double segundaFaixa = (salario - 1212.00) * 0.09;
            double aliquota = primeiraFaixa + segundaFaixa;
            System.out.println("O valor de contribuição ao INSS é " + aliquota + "reais.");
        }else if (salario <= 3641.03) {
            double primeiraFaixa = 1212.00 * 0.075;
            double segundaFaixa = (2427.35 - 1212.00) * 0.09;
            double terceiraFaixa = (salario - 2427.35) * 0.12;
            double aliquota = primeiraFaixa + segundaFaixa + terceiraFaixa;
            System.out.println("O valor de contribuição ao INSS é " + aliquota + "reais.");
        }else if (salario <= 7087.22) {
            double primeiraFaixa = 1212.00 * 0.075;
            double segundaFaixa = (2427.35 - 1212.00) * 0.09;
            double terceiraFaixa = (3641.03 - 2427.35) * 0.14;
            double quartaFaixa = (salario - 2427.35) * 0.12;
            double aliquota = primeiraFaixa + segundaFaixa + terceiraFaixa;
            System.out.println("O valor de contribuição ao INSS é " + aliquota + "reais.");


        }

    }

        }


