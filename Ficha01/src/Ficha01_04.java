import java.util.Scanner;

public class Ficha01_04 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 4 ****");
        Scanner input = new Scanner(System.in);

        //declarar variavel
       double raio, area;
       final double PI=3.1415;

        //ler raio
        System.out.println("introduzir valor inteiro: ");
        raio = input.nextDouble();
        //area
        area=PI*(raio*raio);

        //apresentar area
        System.out.println("a sua area: "+area);

    }
}
