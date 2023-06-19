import java.util.Scanner;

public class Ficha01_08 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 8 ****");
        Scanner input = new Scanner(System.in);

        //declarar variavel
        double num1, num2, num3, pago;

        //ler num1
        System.out.println("introduzir numero inteiro: ");
        num1 = input.nextDouble();

        //ler num2
        System.out.println("introduzir numero inteiro: ");
        num2 = input.nextDouble();

        //ler num3
        System.out.println("introduzir numero inteiro: ");
        num3 = input.nextDouble();

        //calcular preco total
        pago=num1+num2+num3;

        //pago com desconto
        pago=(num1+num2+num3)*0.9;

        //apresnetar pago
        System.out.println("o preco pago e: "+pago);



    }
}