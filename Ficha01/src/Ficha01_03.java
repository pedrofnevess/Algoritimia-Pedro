import java.util.Scanner;

public class Ficha01_03 {
    public static void main(String[] args) {

    // Instanciar Scanner (linha obrigatoria para ler dados da consola)

    System.out.println("**** Exercicio 3 ****");
    Scanner input = new Scanner(System.in);

    //declarar variavel
        int num1, num2, perimetro, area;

        //ler num1
        System.out.println("introduzir numero inteiro: ");
        num1 = input.nextInt();

        //ler num2
        System.out.println("introduzir numero inteiro: ");
        num2 = input.nextInt();

        //perimetro
        perimetro=2*(num1+num2);

        //apresentar perimetro
        System.out.println("o seu perimetro: "+perimetro);

        //area
        area=num1*num2;

        //apresentar area
        System.out.println("a sua area: "+area);

    }
}
