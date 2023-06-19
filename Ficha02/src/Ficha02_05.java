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

        System.out.println("inserir um numero: ");
        num2 = input.nextDouble();

        // num1 e num2 sao iguais
        if (num1 == num2) {
            System.out.println("sao iguais");

            //num1 e num2 sao diferentes
        } else {

            if (num1 > num2) {
                System.out.println("o maior e: " + num1 % num2);
            } else {
                System.out.println("o maior e: " + num2 % num1);
            }

        }
    }
}
