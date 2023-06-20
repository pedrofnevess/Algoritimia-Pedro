import java.util.Scanner;

public class Ficha02_08 {
    public static void main(String[] args) {

        // Instancia obrigatoria do Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 8 ****");
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        double nota1, nota2, nota3, mediaFinal;

        //ler valores notas
        System.out.println("inserir primeira nota: ");
        nota1 = input.nextDouble();
        System.out.println("inserir segunda nota: ");
        nota2 = input.nextDouble();
        System.out.println("inserir terceira nota: ");
        nota3 = input.nextDouble();

        //ler media ponderada
        mediaFinal=(nota1*0.25)+(nota2*0.35)+(nota3*0.40);
        System.out.println("sua media e: " + mediaFinal);

        //aprovado ou nao
        if (mediaFinal > 9.5){
            System.out.println("aprovado!");
        }else{
            System.out.println("vai a exame.");
        }
    }
}
