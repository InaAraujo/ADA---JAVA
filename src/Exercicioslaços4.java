public class Exercicioslaços4 {

    public static void main(String[] args) {

        String produto1 = "Refrigerante";
        double preco1 = 8.50;

        String produto2 = "Bolacha";
        double preco2 = 4.20;

        String produto3 = "Agua";
        double preco3 = 2.50;

        if(preco1 > preco2 && preco1 > preco3){
                    System.out.println(produto1 + " é o produto mais caro é ");
        }else if(preco2 > preco1 && preco2 > preco3){
            System.out.println(produto2 + " é o produto mais caro é ");
        }else {
            System.out.println(produto3 + " é o produto mais caro é ");
        }

    }
}
