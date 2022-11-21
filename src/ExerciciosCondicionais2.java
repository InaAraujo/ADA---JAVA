public class ExerciciosCondicionais2 {

        public static void main(String[] args) {
            int idade = 22;
            double salario = 10000;
            double valorEmprestimo = 30000;
            int numeroParcelas = 24;

            double valorParcela = valorEmprestimo / numeroParcelas;
            double valorMaximoParcela = salario * 0.3;

            System.out.printf(
                    "A pessoa que está solicitando o empréstimo tem %d anos de idade e tem o salário de %.2f reais.\n" +
                            "O valor solicitado é de %.2f reais para ser pago em %d parcelas.\n",
                    idade, salario, valorEmprestimo, numeroParcelas);

            if(idade < 18){
                System.out.println("O empréstimo foi reprovado");
            } else if(idade > 65) {
                System.out.println("O empréstimo foi reprovado");
            } else if(numeroParcelas < 3) {
                System.out.println("O empréstimo foi reprovado");
            } else if(numeroParcelas > 24) {
                System.out.println("O empréstimo foi reprovado");
            } else if(valorParcela > valorMaximoParcela) {
                System.out.printf(
                        "O empréstimo foi reprovado pois uma parcela de %.2f compromete mais " +
                                "do que 30% da renda..", valorParcela
                );
            } else {
                System.out.println("O empréstimo foi aprovado.");
            }
        }
    }