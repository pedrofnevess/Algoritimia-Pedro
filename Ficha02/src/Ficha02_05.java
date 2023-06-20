import java.util.Scanner;

public class Ficha02_05 {
    public static void main(String[] args) {

        // Instancia obrigatoria do Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 5 ****");
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        double num1, num2;

        //ler valores do utilizador

        System.out.println("inserir um numero: ");
        num1 = input.nextDouble();

        System.out.println("inserir outro numero: ");
        num2 = input.nextDouble();

        // numeros iguais
        if (num1 == num2) {
            System.out.println("os numeros sao iguais.");
        }
        // numeros diferentes
        if (num1 > num2) {
            System.out.println("o menor e: " + num2);
            System.out.println("o maior e: " + num1);
        } else {
            if (num1 < num2) {
                System.out.println("o menor e: " + num1);
                System.out.println("o maior e: " + num2);
            }

            // outra forma de resolver
            if (num1 > num2) {
                System.out.println(num1 + " " + num2);
                ;
            } else {
                if (num1 < num2) {
                    System.out.println(num2 + " " + num1);
                }

            }
        }
    }
}
