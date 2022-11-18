
public class ExercicioCondicionais1 {
    public static void main(String[] args) {


       int nota1= 5;
       int nota2 = 8;
       int nota3 = 6;
       int nota4 = 7;

       int media = (nota1 + nota2 + nota3 + nota4) /4;
        System.out.println(media);

       if (media >= 6) {
           System.out.println("Aprovado");
       }else if (media < 6) {
            System.out.println("Reprovado");
        }


    }
}
