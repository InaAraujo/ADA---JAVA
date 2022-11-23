public class Exercicios1 {
    public static void main(String[] args) {
        int[] numeros = new int[args.length];

        for(int i=0; i  < args.length; i++){
            numeros[i] = Integer.parseInt(args[i]);
            System.out.println(numeros[i]);
        }

        int maiorNumero = Integer.parseInt(args[0]);
        int menorNumero = Integer.parseInt(args[0]);
        int numeros1 = Integer.parseInt([args.length]);

        for(int i = 0; i < args.length; i++){
            numeros[i] = Integer.parseInt(args[i]);
            System.out.println(args[i]);
            int numeroAtual = numeros[i];

            if(numeroAtual > i) {
                maiorNumero = numeroAtual;
            } else if (numeroAtual < i) {
                menorNumero = numeroAtual;

            }
        }
        System.out.println("O numero maior é:" + maiorNumero + " e o numero menor é " + menorNumero);
    }

}



