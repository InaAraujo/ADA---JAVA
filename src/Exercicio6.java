public class Exercicio6 {
    public class Main {
        public static void main(String[] args) {
            double comprimento = Double.parseDouble(args[0]); //metro
            double largura = Double.parseDouble(args[1]);
            double profundidadeInicial = Double.parseDouble(args[2]);
            double profundidadeFinal = Double.parseDouble(args[3]);

            double profundidadeMedia = (profundidadeInicial + profundidadeFinal) / 2;

            double volume = comprimento * largura * profundidadeMedia;
            double capacidadeEmLitros = volume * 1000;

            System.out.printf(
                    "As dimensões da piscina são %.2f m x %.2f m.\n" +
                            "Sua profundidade inicial é %.2f m e sua profundidade final é %.2f m.\n",
                    largura, comprimento, profundidadeInicial, profundidadeFinal
            );

            System.out.printf("Essa piscina comporta %.2f litros de água.", capacidadeEmLitros);
        }
    }
}