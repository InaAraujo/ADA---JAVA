public class ExerciciosCondicionais3 {
    public static void main(String[] args) {

        int idade = 70;
        double salario = 2000;
        double valorEmprestimo = 3000;
        int quantidadeParcelas = 80;

        double valorParcela = valorEmprestimo / quantidadeParcelas;
        double valorMaximoDaParcela = salario * 0.3;

        if (idade >= 18 || idade <= 65) {
            System.out.println("Emprestimo aprovado");
        } else {
            System.out.println("Emprestimo Reprovado");
        }


        if (quantidadeParcelas >= 3 && quantidadeParcelas <= 24) {
            System.out.println("Quantidade de parcelas aprovado");
        } else  {
            System.out.println("Reprovado");
        }

        if (valorParcela <= valorMaximoDaParcela) {
            System.out.println("Aprovado");
        }



    }
}