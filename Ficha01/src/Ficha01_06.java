import java.util.Scanner;

public class Ficha01_06 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 6 ****");
        Scanner input = new Scanner(System.in);

        //declara variavel
        double num1, num2, num3, media;

        //ler num1
        System.out.println("introduzir numero inteiro: ");
        num1 = input.nextDouble();

        //ler num2
        System.out.println("introduzir numero inteiro: ");
        num2 = input.nextDouble();

        //ler num3
        System.out.println("introduzir numero inteiro: ");
        num3 = input.nextDouble();

        // media aritimetica
        media=(num1+num2+num3)/2;

        //apresnetar a media aritimetica
        System.out.println("a media aritimetica e: "+media);

        //media ponderada
        media=(num1*0.2)+(num2*0.3)+(num3*0.5);

        //apresnetar a media ponderada
        System.out.println("a media ponderada e: "+media);

    }
}